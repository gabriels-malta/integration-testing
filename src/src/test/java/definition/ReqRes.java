package definition;


import groovy.json.internal.LazyMap;

public class ReqRes {
    private static String API_URL = "https://reqres.in/api/users";
    private static LazyMap fieldsJson = new LazyMap();
    private static String UserId;

    public static String getEndpoint() {
        return API_URL;
    }

    public static void addFields(String field, String value) {
        fieldsJson.put(field, value);
    }

    public static void clearFields() {
        fieldsJson.clear();
    }

    public static LazyMap getFields() {
        return fieldsJson;
    }

    public static void storeUserId(String userId) {
        ReqRes.UserId = userId;
    }

    public  static  String getUserId(){
        return ReqRes.UserId;
    }
}
