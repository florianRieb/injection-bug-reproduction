package de.fri;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class TO {

  @Schema(description = "name", required = false)
  private String name;

  @Schema(description = "age", required = false)
  private Integer age;

  public TO() {

  }

  public TO(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

}
