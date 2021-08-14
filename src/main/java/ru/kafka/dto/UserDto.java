package ru.kafka.dto;


public class UserDto {
    private Long age;
    private String name;
    private Address address;

    public UserDto(Long age,String name,Address address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

