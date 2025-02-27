fun main() {
    println("dime que quieres hacer")
    println("1 -> registrarse")
    println("2 -> iniciar sesión")
    println("3 -> ver eventos")
    var opcion = readln().toInt()

    when (opcion){
        1 -> registro()
        2 -> sesion()
        3 -> eventos()
        else -> println("Opción no válida")
    }
}

fun registro(){
    var registro = ArrayList<String>()
    var nombreRegistro = ""
    var contrasenaRegistro1 = ""
    var contrasenaRegistro2 = ""
    println("nombre de usuario:")
    nombreRegistro = readln()
    registro.add(nombreRegistro)

    do {
        println("contraseña:")
        contrasenaRegistro1 = readln()

        println("repíte la contraseña:")
        contrasenaRegistro2 = readln()

        if (contrasenaRegistro1 != contrasenaRegistro2) {
            println("Las contraseñas no son iguales, por favor introdúzcalas correctamente")
        }

    } while (contrasenaRegistro1 != contrasenaRegistro2)

    registro.add(contrasenaRegistro2)
    println("Registro completado")
}

fun sesion() {
    var usuario = ArrayList<String>()
    var nombreUsuario = ""
    var contrasenaUsuario = ""

    println("nombre de usuario:")
    nombreUsuario = readln()
    usuario.add(nombreUsuario)
    println("contraseña:")
    contrasenaUsuario = readln()
    usuario.add(contrasenaUsuario)

    println("Bienvenido $usuario")
}
    fun eventos() {
        println("eventos disponibles:")
        println("1 -> Feria Gastronómica Sabores del Mundo")
        println("2 -> Conferencia Innovación y Futuro Tecnológico")
        println("3 -> Festival de Jazz Noches de Luna")
        println("-------------------------------------------")
        println("¿De Cuál de los eventos quieres ver los detalles?")
        var eleccion = readln().toInt()

        when (eleccion) {
            1 -> {
                println("Nombre del evento: Cumbre de Innovación Verde 2025")
                println("Lugar: Centro de Convenciones EcoTech, Madrid")
                println("Organizador: Fundación Futuro Sostenible")
                println("Fecha y hora: 10 de mayo de 2025, 09:00 - 18:00")
            }
            2 -> {
                println("Nombre del evento: Expo Energías Renovables y Smart Cities")
                println("Lugar: Palacio de Congresos Sustentables, Ciudad de México")
                println("Organizador: Alianza por el Desarrollo Tecnológico Sustentable")
                println("Fecha y hora: 20 de julio de 2025, 10:00 - 19:00")
            }
            3 -> {
                println("Nombre del evento: Foro Internacional de Tecnología Circular")
                println("Lugar: Centro Tecnológico Circular, Berlín")
                println("Organizador: Instituto Europeo de Innovación Ambiental")
                println("Fecha y hora: 5 de noviembre de 2025, 08:30 - 17:30")
        }
            else -> println("Opción no válida")
    }
}