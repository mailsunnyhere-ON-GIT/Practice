import React from 'react';
export default function Applebucket({count,bucketname})
{
    
    return(
        <div>
        <h1>{count} Apples</h1>
        <p>bucket {bucketname}</p>
        </div>
    )
    
}