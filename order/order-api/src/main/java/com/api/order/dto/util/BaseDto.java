package com.api.order.dto.util;


import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@SuperBuilder
public abstract class BaseDto implements Serializable {
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;
}
