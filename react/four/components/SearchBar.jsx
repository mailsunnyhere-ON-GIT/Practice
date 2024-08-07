import React from 'react'

export default function SearchBar({setonScreen}) {
  return (
    <div className="search-container">
      <i className="fa-solid fa-magnifying-glass"></i>
      <input type="text" 
      onChange={(e)=> setonScreen(e.target.value.toLowerCase()) }
      placeholder="Search for a country..." />
    </div>
  )
}