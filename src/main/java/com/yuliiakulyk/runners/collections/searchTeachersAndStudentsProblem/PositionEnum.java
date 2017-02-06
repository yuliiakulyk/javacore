package com.yuliiakulyk.runners.collections.searchTeachersAndStudentsProblem;

/**
 * Created by Yuliia Kulyk on 01.12.2016.
 */
public enum PositionEnum {
    PROFESSOR("professor"), LABORATORY_ASSISTANT("laboratory assistant"), HEAD_OF_DEPARTMENT("head of department");

    String positionName;

    PositionEnum(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
}
