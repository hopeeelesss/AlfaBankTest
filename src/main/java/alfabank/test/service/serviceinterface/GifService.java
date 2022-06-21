package alfabank.test.service.serviceinterface;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface GifService {

    ResponseEntity<Map> getGif(String tag);
}