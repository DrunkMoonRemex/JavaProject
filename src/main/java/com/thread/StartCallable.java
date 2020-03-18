package com.thread;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class StartCallable implements Callable {

    @Override
    public Object call() throws Exception {
        WebDownload download = new WebDownload();
        download.download(url,name);
        System.out.println(name);
        return name;
    }
    private String url;//远程下载路径
    private  String name;//存储名字


    public StartCallable(String url, String name) {
        this.url=url;
        this.name=name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StartCallable th1 = new StartCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584467155842&di=5943c195ea1b6cfb5425de6cb49dd2c5&imgtype=0&src=http%3A%2F%2Fimg.mp.sohu.com%2Fq_mini%2Cc_zoom%2Cw_640%2Fupload%2F20170731%2F4c79a1758a3a4c0c92c26f8e21dbd888_th.jpg","src/main/resources/kouhao.jpg");
        StartCallable th2 = new StartCallable("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584467204343&di=2fb62462a1d4f66c0f6c712a181018c4&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201507%2F27%2F20150727084803_cLrJP.thumb.700_0.jpeg","src/main/resources/beautiful.jpeg");
        StartCallable th3 = new StartCallable("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=583682853,3090416684&fm=11&gp=0.jpg","src/main/resources/queen.jpg");

        //创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //提交执行
        Future res1 = executorService.submit(th1);
        Future res2 = executorService.submit(th2);
        Future res3 = executorService.submit(th3);
        //获取结果
        Object ob1 = res1.get();
        Object ob2 = res2.get();
        Object ob3 = res3.get();
        System.out.println(ob1+","+ob2+","+ob3);
        //关闭服务
        List<Runnable> runnables = executorService.shutdownNow();
        System.out.println(Arrays.asList(runnables));
    }
}
