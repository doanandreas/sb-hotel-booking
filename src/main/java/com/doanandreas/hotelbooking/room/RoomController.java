package com.doanandreas.hotelbooking.room;

import com.doanandreas.hotelbooking.room.dto.RoomDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping
    public RoomDto GetRooms() {
        return new RoomDto(304, true);
    }

    @PostMapping
    public RoomDto AddRoom(@RequestBody Room room) {
        return new RoomDto(room.roomNumber(), false);
    }
}
