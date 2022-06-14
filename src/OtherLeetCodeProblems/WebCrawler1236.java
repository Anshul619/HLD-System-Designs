package OtherLeetCodeProblems;

/**
 * LeetCode - https://leetcode.com/problems/web-crawler/
 */

public class WebCrawler1236 {
    private String getHostName(String url) {

        String s_URL[] = url.split("//");
        String s1 = s_URL[1];
        String s2[] = s1.split("/");
        String hostname = s2[0];

        return hostname;

    }

    /*public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        //System.out.println(htmlParser.getUrls(startUrl));

        HashSet<String> alreadyCrawledURLs = new HashSet<String>();
        List<String> output = new ArrayList<>();

        Stack<String> urlsStack = new Stack<String>();
        urlsStack.push(startUrl);

        String hostName = getHostName(startUrl);

        while(!urlsStack.isEmpty()) {

            String url = urlsStack.pop();

            if (!alreadyCrawledURLs.contains(url)) {

                alreadyCrawledURLs.add(url);
                List<String> temp = htmlParser.getUrls(url);

                for (String newURL: temp) {

                    String newURLHostName = getHostName(newURL);

                    if (newURLHostName.equals(hostName)) {
                        urlsStack.push(newURL);
                    }
                }
            }

        }

        for(String crawledURL: alreadyCrawledURLs) {
            output.add(crawledURL);
        }

        return output;
    }*/
}
