//        Liga liga = new Liga();
//        Equipo madrid = new Equipo("Real Madrid", "Santiago Bernabéu", "Madrid");
//        Equipo barca  = new Equipo("FC Barcelona", "Camp Nou", "Barcelona");
//
//        liga.addEquipo(madrid);
//        liga.addEquipo(barca);
//
//        try {
//            Partido p1 = new Partido(1, madrid, barca);
//            liga.addPartido(p1);
//            p1.ponerResultado("2-1");
//            System.out.println("Primer partido creado y resultado puesto correctamente:");
//            System.out.println(p1);
//        } catch (LaLigaExceptions e) {
//            System.out.println("Error al crear el primer partido o poner resultado: " + e.getMessage());
//        }
//
//        Partido p2 = null;
//        Partido p3 = null;
//        boolean creados = false;
//
//        while (!creados) {
//            try {
//                p2 = new Partido(2, madrid, barca);
//                p2.ponerResultado("0-0");
//
//                p3 = new Partido(3, barca, madrid);
//                p3.ponerResultado("1-2");
//
//                liga.addPartido(p2);
//                liga.addPartido(p3);
//
//                creados = true;
//            } catch (LaLigaExceptions e) {
//                System.out.println("Error al crear alguno de los dos partidos: " + e.getMessage());
//                System.out.println("Reintentando crear los dos partidos...\n");
//
//            }
//        }
//
//        System.out.println("\nInformación de los partidos:");
//        System.out.println(p2);
//        System.out.println(p3);
//
//        System.out.println("\nInformación de los equipos:");
//        for (Equipo e : liga.getEquipos()) {
//            System.out.println(e);