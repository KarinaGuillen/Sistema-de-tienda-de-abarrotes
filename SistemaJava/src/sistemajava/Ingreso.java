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
    
    private final float monto_pagado;
    private final float costo;
    
    public Ingreso(float monto_pagado, float costo)
    {    
        
        this.monto_pagado = monto_pagado;
        this.costo = costo;
           
    }
    
    public float get_monto_pagado()
    {
        return monto_pagado;
    }
    
    public float get_costo()
    {
        return costo;
    }
    
    public float calcular_cambio()
    {
        float cambio;
        cambio = monto_pagado - costo;
        return cambio;
        
    }
}
