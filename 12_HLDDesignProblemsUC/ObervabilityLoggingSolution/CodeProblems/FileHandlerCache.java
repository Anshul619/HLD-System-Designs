package LoggingSolution.CodeProblems;

/**
 * https://stackoverflow.com/questions/14842457/how-to-cache-file-handles
 */

import java.security.Key;

/*public class FileHandlerCache {
    LoadingCache<Key, Handle> graphs = CacheBuilder.newBuilder()
            .maximumSize(100) // sensible value for open handles?
            .expireAfterAccess(5, TimeUnit.MINUTES)
            .removalListener(removalListener)
            .build(
                    new CacheLoader<Key, Handle>() {
                        public Handle load(Key key) throws AnyException {
                            return openHandle(key);
                        }
                    });

    RemovalListener<Key, Handle> removalListener =
            new RemovalListener<Key, Handle>() {
                public void onRemoval(RemovalNotification<Key, Handle> removal) {
                    Handle h = removal.getValue();
                    h.close(); // tear down properly
                }
            };
}*/
