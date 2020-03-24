package sample;

public class Calculations {
    public float Arraymultiply(float[] array){
        float total = 0f;
        for(float num : array)
        {
            if(total ==  0)
            {
                total = num;
            }
            else
            {
                total = total * num;
            }
        }
        return total;
    }
    public float add(float[] array)
    {
        float total = 0f;
        for(float num : array)
        {
            if(total ==  0)
            {
                total = num;
            }
            else
            {
                total = total +  num;
            }
        }
        return total;
    }
    public float divide(float[] array)
    {
        float total = 0f;
        for(float num : array)
        {
            if(total ==  0)
            {
                total = num;
            }
            else
            {
                total = total /  num;
            }
        }
        return total;
    }
    public float subtraction(float[] array)
    {
        float total = 0f;
        for(float num : array)
        {
            if(total ==  0)
            {
                total = num;
            }
            else
            {
                total = total -  num;
            }
        }
        return total;
    }
}
