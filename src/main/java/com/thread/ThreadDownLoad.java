package com.thread;

public class ThreadDownLoad extends  Thread{

    private String url;//远程下载路径
    private  String name;//存储名字

    @Override
    public void run() {
        WebDownload download = new WebDownload();
        download.download(url,name);
        System.out.println(name);
    }

    public ThreadDownLoad(String url, String name) {
        this.url=url;
        this.name=name;
    }

    public static void main(String[] args) {
        ThreadDownLoad th1 = new ThreadDownLoad("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584467155842&di=5943c195ea1b6cfb5425de6cb49dd2c5&imgtype=0&src=http%3A%2F%2Fimg.mp.sohu.com%2Fq_mini%2Cc_zoom%2Cw_640%2Fupload%2F20170731%2F4c79a1758a3a4c0c92c26f8e21dbd888_th.jpg","src/main/resources/kouhao.jpg");
        ThreadDownLoad th2 = new ThreadDownLoad("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584467204343&di=2fb62462a1d4f66c0f6c712a181018c4&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201507%2F27%2F20150727084803_cLrJP.thumb.700_0.jpeg","src/main/resources/beautiful.jpeg");
        ThreadDownLoad th3 = new ThreadDownLoad("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=583682853,3090416684&fm=11&gp=0.jpg","src/main/resources/queen.jpg");

        th1.start();
        th2.start();
        th3.start();
    }
}
