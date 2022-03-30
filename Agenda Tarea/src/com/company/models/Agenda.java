package com.company.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Treming20 on 04/11/2017.
 */
public class Agenda {
    Contacto contacto;
    List<Contacto> listContacto=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int idContacto=0;

    public void Menu()
    {
        int opcion;
        String buscar;
        int id;

        do{

            System.out.println("--------MENU----------");
            System.out.println("1-Agregar");
            System.out.println("2-Listar");
            System.out.println("3-Buscar");
            System.out.println("4-Modificar");
            System.out.println("5-Eliminar");
            System.out.println("0-Salir");
            System.out.println("Digitar opcion: ");
            opcion=sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    AgregarContacto();
                    break;

                case 2:
                    ListarContactos();
                    break;
                case 3:
                    System.out.println("Digite la palabra que desea buscar:");
                    buscar=sc.nextLine();
                    BuscarContactos(buscar);
                    break;
                case 4:
                    System.out.println("Digite el ID del contacto a modificar:");
                    id=sc.nextInt();
                    sc.nextLine();
                    ModificarContacto(id);
                    break;
                case 5:
                    System.out.println("Digite el ID del contacto a eliminar:");
                    id=sc.nextInt();
                    sc.nextLine();
                    EliminarContacto(id);
                    break;
                case 0:
                    System.out.println("Good bye!!!");
                    break;
            }
        } while(opcion!=0);
    }

    private void AgregarContacto()
    {
        contacto=new Contacto();

        idContacto++;
        contacto.setId(idContacto);

        System.out.println("Favor digitar su nombre: ");
        contacto.setNombre(sc.nextLine());

        System.out.println("Favor digitar su apellido: ");
        contacto.setApellido(sc.nextLine());

        System.out.println("Favor digitar su direccion: ");
        contacto.setDireccion(sc.nextLine());

        contacto.setListTelefono(listaTelefono());

        Categoria categoria=new Categoria();
        System.out.println("Favor digitar su categoria: ");
        categoria.setNombre(sc.nextLine());

        System.out.println("Favor digitar su descripcion de categoria: ");
        categoria.setDescripcion(sc.nextLine());

        contacto.setCategoria(categoria);

        listContacto.add(contacto);
    }

    private List<Telefono> listaTelefono()
    {
        List<Telefono> listTelefono=new ArrayList<>();
        int OtroTel=0;

        do {
            Telefono telefono = new Telefono();
            System.out.println("Favor digitar su telefono: ");
            telefono.setTelefono(sc.nextLine());

            System.out.println("Favor digitar su tipo: ");
            telefono.setTipo(sc.nextLine());

            contacto.setTelefono(telefono);
            listTelefono.add(telefono);

            System.out.println("Desea agregar otro telefono? 1=SI 0=NO");
            OtroTel=sc.nextInt();
            sc.nextLine();

        }while (OtroTel!=0);

        return  listTelefono;
    }

    private void ListarContactos()
    {
        for (Contacto contactoTep : listContacto) {
            System.out.println(contactoTep.toString());
        }
    }

    private void BuscarContactos(String palabra)
    {
        for (Contacto contactoTep : listContacto) {
            if(contactoTep.toString().contains(palabra)) {
                System.out.println(contactoTep.toString());
            }
        }
    }

    private void ModificarContacto(int id)
    {
        int campo=0;
        String modificar="";
        System.out.println("1 - NOMBRE ");
        System.out.println("2 - APELLIDO ");
        System.out.println("3 - DIRECCION ");
        System.out.println("Digite el campo a modificar: ");
        campo=sc.nextInt();
        sc.nextLine();

        System.out.println("Digite el nuevo valor a modificar: ");
        modificar=sc.nextLine();

        for(int i=0; i<=listContacto.size()-1; i++){
            if(listContacto.get(i).id==id){
                switch (campo){
                    case 1:
                        listContacto.get(i).setNombre(modificar);
                        break;
                    case 2:
                        listContacto.get(i).setApellido(modificar);
                        break;
                    case 3:
                        listContacto.get(i).setDireccion(modificar);
                        break;
                    case 0:
                        break;
                }
            }
        }

        System.out.println("Campo modificado exitosamente!!!");
    }

    private void EliminarContacto(int id)
    {
        for(int i=0; i<=listContacto.size()-1; i++){
            if(listContacto.get(i).id==id){
                listContacto.remove(i);
            }
        }
    }

}
