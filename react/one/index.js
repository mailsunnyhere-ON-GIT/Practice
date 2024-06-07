import { createRoot } from 'react-dom/client';
import React from 'react';

const one = <h1>Sunny is here</h1>;
const rooter = createRoot(document.getElementById('root'));
rooter.render(one);
