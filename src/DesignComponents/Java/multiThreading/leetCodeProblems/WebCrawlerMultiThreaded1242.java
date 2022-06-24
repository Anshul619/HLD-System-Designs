package Java.multiThreading.leetCodeProblems;

/**
 * LeetCode - https://leetcode.com/problems/web-crawler-multithreaded/
 */
public class WebCrawlerMultiThreaded1242 {

    private String getHostName(String url) {

        String s_URL[] = url.split("//");
        String s1 = s_URL[1];
        String s2[] = s1.split("/");
        String hostname = s2[0];

        return hostname;

    }

    /*public List<String> crawl(String startUrl, HtmlParser htmlParser) {

        // find hostname
        String hostname = getHostName(startUrl);

        // multi-thread
        Crawler crawler = new Crawler(startUrl, hostname, htmlParser);
        crawler.map = new ConcurrentHashMap<>(); // reset result as static property belongs to class, it will go through all of the test cases
        crawler.result = crawler.map.newKeySet();
        Thread thread = new Thread(crawler);
        thread.start();

        crawler.joinThread(thread); // wait for thread to complete
        return new ArrayList<>(crawler.result);
    }

    class Crawler implements Runnable {

        String startUrl;
        String hostname;
        HtmlParser htmlParser;

        public static ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        public static Set<String> result = map.newKeySet();

        public Crawler(String startUrl, String hostname, HtmlParser htmlParser) {
            this.startUrl = startUrl;
            this.hostname = hostname;
            this.htmlParser = htmlParser;
        }

        @Override
        public void run() {

            String newHostName = getHostName(this.startUrl);

            if (newHostName.equals(hostname) && !this.result.contains(this.startUrl)) {

                this.result.add(this.startUrl);
                List<Thread> threads = new ArrayList<>();

                for (String s : htmlParser.getUrls(startUrl)) {

                    if (result.contains(s)) {
                        continue;
                    }

                    Crawler crawler = new Crawler(s, hostname, htmlParser);
                    Thread thread = new Thread(crawler);
                    thread.start();
                    threads.add(thread);
                }

                for (Thread t : threads) {
                    joinThread(t); // wait for all threads to complete
                }

            }
        }

        public static void joinThread(Thread thread) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }*/
}
