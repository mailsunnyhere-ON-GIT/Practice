import Header from './components/Header'
import SearchBar from './components/SearchBar'
import SelectMenu from './components/SelectMenu'
import CountriesList from './components/CountriesList'
import { useState } from 'react'

import './App.css'

const App = () => {
  const[onScreen,setonScreen]=useState('')
  return (
    <>
      <Header />
      <main>
        <div className="search-filter-container">
          <SearchBar setonScreen={setonScreen}/>
          <SelectMenu />
        </div>
        <CountriesList onScreen={onScreen}/>
      </main>
    </>
  )
}

export default App