
	
	import java.util.Scanner;


	/**
	 * Esta clase se encarga de almacenar las notas de un estudiante
	 * */
	
	public class notasCurso {
		
		/**
		 * Variables donde se almacenan las notas de la unidad formativa
		 */
		
		double notaUf1, notaUf2, notaUf3;
		/**
		 * Variables donde se almacenan los acumulados de la nota ponderados 
		 */
		
		double acum1, acum2, acum3, def;
		
		/**
		 * Clase Scanner: Ayuda a capturar la entrada del teclado del usuario
		 */
		Scanner entrada = new Scanner(System.in);
	
		/**
		 * Metodo que pide al usuario que ingrese las notas de sus unidades formativas
		 */
		public void IngresoNotas() {
			
			System.out.println("ingrese las notas del estudiante");
			
			System.out.print("ingrese nota 1: ");
			notaUf1= entrada.nextDouble();

			System.out.print("ingrese nota 2: ");
			notaUf2= entrada.nextDouble();
			
			System.out.print("ingrese nota 3: ");
			notaUf3= entrada.nextDouble();
		}
		
		/**
		 * Metodo que revisa que los datos introducidos son correctos
		 */
		
		public void comprobacion(){
			
			if (notaUf1>10 ) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (notaUf2>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (notaUf3>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}
			
		}
		
		/**
		 * Metodo que calcula la nota final segun las notas recogidas y su ponderacion
			 
		 */
		
		public void Calcunotas() {
			acum1= notaUf1 *0.35;
			acum2 = notaUf2 * 0.35;
			acum3 = notaUf2 * 0.30;
			
			def = acum1 + acum2+ acum3;
			
		}
		
		/**
		 * Metodo que muestra las notas que se han introducido
		 */
		
		public void Demostrar() {
		
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + notaUf1);
			System.out.println(" nota2 = " + notaUf2);
			System.out.println(" nota3 = " + notaUf3);
			
			System.out.println(" acumulado 1 = "+ acum1);
			System.out.println(" acumulado 2 = "+ acum2);
			System.out.println(" acumulado 3 = "+ acum3);
			
			System.out.println(" nota definitiva es = "+ def);
			
		}
		
		/**
		 * Metodo que determina si el alumno esta aprobado o no y devuelve este resultado
		 */
		
		public void aprobar() {
				
				if(def<5 && def>=0) {
					System.out.println("suspendio");
				}else {
					if (def>=5 && def<=10 ) {
					System.out.println("aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}
		/**
		 * crea un objeto de la clase Notas y ejecuta los métodos
		 * @param args
		 */
		
		public static void main(String[] args) {
			/**
			 * crea objeto de la clase notas
			 */
			notasCurso fc= new notasCurso();
			
			fc.IngresoNotas();
			
			fc.comprobacion();
			fc.Calcunotas();
			fc.Demostrar();
			
			fc.aprobar();
			
		}

	}

