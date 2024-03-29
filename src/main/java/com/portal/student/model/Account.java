package com.portal.student.model;

import lombok.Data;

@Data
public class Account {
    private Long id;
    private String studentId;
    private boolean hasOutstandingBalance;
}
