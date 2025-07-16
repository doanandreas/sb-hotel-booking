package com.doanandreas.hotelbooking.room;

import com.doanandreas.hotelbooking.room.dto.GetAllRoomsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping
    public GetAllRoomsDto GetRooms() {
        return new GetAllRoomsDto(304, true);
    }
}
