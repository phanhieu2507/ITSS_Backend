package manager.gym.Gym.Manager.controller.gym;

import manager.gym.Gym.Manager.entity.gym.YogaClass;
import manager.gym.Gym.Manager.service.YogaClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class YogaClassController {
    @Autowired
    private YogaClassService yogaClassService;

    @GetMapping("/yogaclass")
    public ResponseEntity<List<YogaClass>> getAll(){
        return new ResponseEntity<List<YogaClass>>(yogaClassService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/yogaclass/add")
    public ResponseEntity<String> save(@RequestBody YogaClass yogaClass){
        return new ResponseEntity<String>(yogaClassService.save(yogaClass), HttpStatus.OK);
    }

    @PostMapping("/yogaclass/update?id={id}&maximum={maximum}")
    public ResponseEntity<Integer> updateByIdAndName(@RequestParam(name = "id") String id, @RequestParam(name = "maximum") int maximumNumber){
        return new ResponseEntity<Integer>(yogaClassService.updateMaximumNumberByID(id,maximumNumber),HttpStatus.OK);

    }

}
