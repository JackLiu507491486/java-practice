package com.JAVASE_BASE.ATMDemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        //定义一个容器，存放账户
        ArrayList<Account> Accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=========ATM系统=========");
            System.out.println("1.账户登录");
            System.out.println("2.注册账户");
            System.out.print("请输入你的操作:");
            //System.out.println("========================");
            int command = sc.nextInt();
            switch (command){
                case 1://账户登录
                    loginAccount(Accounts,sc);
                    break;
                case 2://注册账户
                    createAccount(Accounts,sc);
                    break;
                default://输入其他
                    System.out.println("你的输入命令有误");

            }
        }

    }

    private static void loginAccount(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("=========系统登陆=========");
        if (accounts.size() == 0){
            System.out.println("系统中没有任何账户，请先开户");
            return;
        }

        Account account;
        String cardID;
        String password;

        while (true) {
            System.out.println("请输入你的账号:");
            cardID = sc.next();
            account = getAccountByID(accounts,cardID);
            if(account == null) System.out.println("未查到该账户，请重新输入!");
            else {
                while (true) {
                    System.out.println("请输入账号密码:");
                    password = sc.next();
                    if (password.equals(account.getPassword())) {
                        System.out.println("登录成功！尊敬的" + account.getName() + "客户。卡号" + account.getID());
                        showUsersCommands(sc,account,accounts);
                        return;
                    }else
                        System.out.println("密码有误");
                }
            }
        }
    }

    /*
        展示登陆后的操作页
     */
    private static void showUsersCommands(Scanner sc,Account account,ArrayList<Account> accounts) {
        while (true) {
            System.out.println("=========用户操作页=========");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出系统");
            System.out.println("7.注销账户");
            System.out.print("请输入你要进行的操作:");
            int command = sc.nextInt();

            switch (command){
                case 1:
                    //查询
                    showAccount(account);
                    break;
                case 2:
                    //存款
                    addMoney(account,sc);
                    break;
                case 3:
                    //取款
                    subMoney(account,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(account,sc,accounts);
                    break;
                case 5:
                    //修改密码
                    if(changePassword(account,sc))
                        return;
                    else break;
                case 6:
                    //退出
                    System.out.println("退出成功，欢迎下次光临");
                    return;
                case 7:
                    //销户
                    if(deleteAccount(account,accounts,sc))
                        return;
                    else break;
                default:
                    System.out.println("你的操作有误");
        }
        }
    }

    /**
     * 修改密码
     * @param account
     * @param sc
     */
    private static boolean changePassword(Account account, Scanner sc) {
        System.out.println("请输入账户当前密码:");
        String password = sc.next();
        if(password.equals(account.getPassword())){
            System.out.println("请输入修改后的密码:");
            String password1 = sc.next();
            if(!password.equals(password1)){
                System.out.println("修改成功");
                account.setPassword(password1);
                return true;
            }else {
                System.out.println("修改密码失败！两次密码完全一致");
            }
        }else{
            System.out.println("当前密码输入错误！！");
        }
        return false;
    }

    /**
     * 销户功能
     * @param account 登陆账户
     * @param accounts 总账户
     */
    private static boolean deleteAccount(Account account, ArrayList<Account> accounts, Scanner sc) {
            System.out.println("确定要注销你的账户嘛:(YES/NO):");
            String command = sc.next();
            switch (command){
                case "YES": case "yes": case "Yes":
                    accounts.remove(account);
                    return true;
                case "NO": case "no": case "No":
                    break;
                default:
                    System.out.println("你的输入有误！！");
            }
            return false;
    }

    /**
     * 转账功能
     * @param account 转账的用户
     * @param sc
     * @param accounts 全部用户
     */
    private static void transferMoney(Account account, Scanner sc, ArrayList accounts) {
        System.out.println("==========转账界面==========");
        if(accounts.size() < 2){
            System.out.println("账户对象不足两个，无法转账");
        }else {
            System.out.println("请输入转账账户的账号:");
            String ID = sc.next();
            Account account1 = getAccountByID(accounts,ID);
            if (account1 == null) System.out.println("未查询到该账户！");
            else {
                    System.out.println("请输入该账户的户主名称:");
                    String name = sc.next();
                    if(!name.equals(account1.getName())) System.out.println("名称输入错误,请重新输入（超过三次自动退出）");
                    else {
                        System.out.println("请输入存钱金额（限额：" + account.maxMoney + "元）：");
                        double money = sc.nextDouble();
                        if(money > account.getMoney()){
                            System.out.println("转账失败，转账金额超出账户余额！" + "当前余额" + account.getMoney());
                        }else if(money > account.maxMoney || money < 0) {
                            System.out.println("转账失败，转账金额超出限额！");
                        }else {
                            account.setMoney(account.getMoney() - money);
                            account1.setMoney(account1.getMoney() + money);
                            System.out.println("转账成功,账户当前信息:");
                            showAccount(account);
                            return;
                        }
                 }
            }
        }
    }

    /**
     * 取款操作
     * @param account 登陆的账户
     * @param sc
     */
    private static void subMoney(Account account, Scanner sc) {
        System.out.println("=========取款界面=========");
        if(account.getMoney() < 100){
            System.out.println("你的账户不足100元无法取出，请到柜台办理取款业务");
        }else{
            System.out.println("请输入取款金额（限额：" + account.maxMoney + "元）：");
            double outMoney = sc.nextDouble();
            if(outMoney > account.getMoney()){
                System.out.println("取款失败，取款金额超出账户余额！" + "当前余额" + account.getMoney());
            }else if(outMoney > account.maxMoney || outMoney < 0){
                System.out.println("取款失败，取款金额超出限额！");
            }else {
                account.setMoney(account.getMoney() - outMoney);
                System.out.println("取款成功，账户信息如下");
                showAccount(account);
            }
        }
    }

    /**
     * 存钱功能
     * @param account 登陆的账户
     * @param sc
     */
    private static void addMoney(Account account,Scanner sc) {
        System.out.println("=========存钱界面=========");
        System.out.println("请输入存钱金额（限额：" + account.maxMoney + "元）：");
        double inMoney = sc.nextDouble();
        if(inMoney <= account.maxMoney && inMoney > 0) {
            account.setMoney(account.getMoney() + inMoney);
            System.out.println("存款成功,账户信息如下");
            showAccount(account);
        }else {
            System.out.println("存款失败!未在限额范围之内。");
        }
    }

    /**
     * 展示账户信息
     * @param account 登陆的账户
     */
    private static void showAccount(Account account) {
        System.out.println("=========账户信息如下=========");
        System.out.println("卡号：" + account.getID());
        System.out.println("户主：" + account.getName());
        System.out.println("余额：" + account.getMoney());
    }

    /**
     * 创建账户
     * @param accounts 账户的容器
     * @param sc 输入
     */
    private static void createAccount(ArrayList<Account> accounts,Scanner sc) {
        Account temp = new Account();
        String firstInput;
        String secondInput;
        String cardID ;
        System.out.println("=========办卡界面=========");
        System.out.print("请输入您的姓名:");
        temp.setName(sc.next());
        while (true) {
            System.out.print("请输入你的密码:");
            firstInput = sc.next();
            System.out.print("请确认你的密码:");
            secondInput = sc.next();
            if(!firstInput.equals(secondInput))
                System.out.println("您两次密码输入不一致。请重新输入");
            else break;
        }
        temp.setPassword(secondInput);
        cardID = getRandomID(accounts);
        temp.setID(cardID);

        accounts.add(temp);
        System.out.println("你的卡号:" + temp.getID());
    }

    /**
     * 创建一个随机数账号且账号不重复
     * @param accounts 账户的容器
     * @return 账号
     */
    private static String getRandomID(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            String cardID = "";
            for (int i = 0; i < 8; i++) {
                cardID += r.nextInt(10);
            }
            if(getAccountByID(accounts,cardID) == null){
                return cardID;
            }
        }
    }

    /**
     * 根据卡号查询一个账户出来
     * @param accounts 账户的容器
     * @param cardID 卡号
     * @return 查询到的账户
     */

    private static Account getAccountByID(ArrayList<Account> accounts, String cardID) {
        Account acc;
        for (int i = 0;i < accounts.size();i++){
            acc = accounts.get(i);
            if(acc.getID().equals(cardID))
                return acc;
        }
        return null;
    }
}
