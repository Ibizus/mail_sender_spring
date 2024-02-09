package org.iesvdm.mail_sender_spring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    // Hemos metido @Valid en el controller. por lo que habria que utilizar las anotaciones de validacion en el modelo:
    private String nombre;

    private String email;

}
