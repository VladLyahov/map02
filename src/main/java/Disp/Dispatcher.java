package Disp;

import by.googlemapid.sample.DirectionSample;
import com.google.common.collect.Maps;
import org.json.JSONException;

import java.io.IOException;
import java.util.Map;

/**
 * Created by govno on 07.04.2016.
 */
public class Dispatcher {
    public static void main(final String[] args) throws IOException, JSONException {
        //String asd = "Россия, Москва, улица Поклонная, 12";
       // DirectionSample.main(asd);


    }
    public static int doDistance (String address) throws IOException, JSONException {
        String[] A=new String[2];
        A[0]="Россия, Москва, улица Дениса Давыдова, 7";
        A[1]= "Россия, Москва, улица Обручева 29";
        final Map<String, String> params = Maps.newHashMap();
        params.put("sensor", "false");// указывает, исходит ли запрос на геокодирование от устройства с датчиком
        params.put("language", "ru");// язык данные на котором мы хочем получить
        params.put("mode", "walking");// способ перемещения, может быть driving, walking, bicycling
        params.put("origin", "Россия, Москва, улица Дениса Давыдова, 7");// адрес или текстовое значение широты и
//         отправного пункта маршрута
        params.put("destination", address);// адрес или текстовое значение широты и долготы
        // долготы конечного пункта маршрута
        //DirectionSample.main(A,params);
        int time = DirectionSample.main(A,params);
        return time;

    }



}
