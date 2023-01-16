package com.api.core.exception;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionMessage {
    String timestamp;
    int status;
    String error;
    String message;
    String path;
}
