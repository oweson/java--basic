package top.sea521.design.Observer;

import java.util.LinkedList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:11
 */
public class HeadHunter implements  Subject {
    private LinkedList<Observer> userList;
    private LinkedList<String> jobs;

    public HeadHunter() {
        userList = new LinkedList<Observer>();
        jobs = new LinkedList<String>();
    }

    @Override
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o: userList) {
            o.update(this);
        }
    }

    public void addJob(String job) {
        // 添加职位
        jobs.add(job);
        notifyAllObservers();
    }

    public LinkedList<String> getJobs() {
        return jobs;
    }

    public String toString() {
        return jobs.toString();
    }


}
