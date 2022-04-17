/*

package com.example.springboot.interviews.blackrock;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CacheImpl {
    private
    private static final long retentionPeriod=30*60*1000;
    private static  long lastReloadCalled;
    private static final long MAX_SIZE=10000;


        public void getData(String key) {
            if(map.size()>MAX_SIZE){
                reloadCache();
            }
            If(map.containsKey(key)) {
                return map.get(key);
            }
            Else {
                String org.example.DSA.structure.data = loadDate(key);
                map.put(key, org.example.DSA.structure.data);
                return org.example.DSA.structure.data;
            }
        }
            private String loadData(String key){
                BufferedReader br=new BufferedReader(new FileReader())

            }

         class CacheKey{
            private long creationTime;
            private String key;

             public CacheKey(long creationTime) {
                 this.creationTime = creationTime;
             }

             public long getCreationTime() {
                 return creationTime;
             }

             public void setCreationTime(long creationTime) {
                 this.creationTime = creationTime;
             }
         }

         private void reloadCache(){
             Iterator<Map.Entry<CacheKey,String>> iterator=map.entrySet().iterator();
             while (iterator.hasNext()){
                 CacheKey key=iterator.next().getKey();
                 if(key.creationTime<(System.currentTimeMillis()-retentionPeriod ||  System.currentTimeMillis()-lastUsed >1000*30) ){
                     if(map.size()>=MAX_SIZE && )


                     iterator.remove(key);
                 }

             }
            {

             }

         }



    }





*/
