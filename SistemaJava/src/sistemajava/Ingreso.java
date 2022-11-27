/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemajava;

/**
 *
 * @author Karina Guillen
 */
public class Ingreso {
    
    private final int monto_pagado;
    private final int costo;
    
    public Ingreso(int monto_pagado, int costo)
    {    
        
        this.monto_pagado = monto_pagado;
        this.costo = costo;
           
    }
    
    public int get_monto_pagado()
    {
        return monto_pagado;
    }
    
    public int get_costo()
    {
        return costo;
    }
    
    public int acceder()
    {
        int cambio;
        cambio = monto_pagado - costo;
        return cambio;
        
    }
}
