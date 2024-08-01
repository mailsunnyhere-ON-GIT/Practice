import Applebucket from "./Applebucket"
import React, { useState } from 'react';
import left from "../assets/—Pngtree—vector left arrow icon_4231912.png"
import right from "../assets/—Pngtree—vector right arrow icon_4231911.png"
import "../index.css"

export default function Applelist()
{
     let totalApple=10;
     const[leftApple,setLeftApple]=useState(totalApple)
     const[rightApple,setRightApple]=useState(totalApple-leftApple)

     function leftClick()
     {
        if(leftApple<10)
        {
            setLeftApple(leftApple+1)
            setRightApple(rightApple-1)
        }
     }
     function rightClick()
     {
        if(rightApple<10)
            {
                setLeftApple(leftApple-1)
                setRightApple(rightApple+1)
            }
     }

    return(
        <section>
            <Applebucket count={leftApple} bucketname={1}/>
            <button title="left-button" onClick={leftClick}><img src={left} alt="left"/></button>
            <button title="right-button" onClick={rightClick}><img src={right} alt="right"/></button>
            <Applebucket count={rightApple} bucketname={2}/>
        </section>
    )
}