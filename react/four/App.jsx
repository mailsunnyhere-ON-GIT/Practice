import Header from "./components/Header"
import "./App.css"
import SearchBar from "./components/SearchBar"
import SelectMenu from "./components/SelectMenu"
export default function App()
{
   return(
   <>
    <Header/>
    <main>
    <div className="search-filter-container">
      <SearchBar/>
      <SelectMenu/>
    </div>
    </main>
    
    </>
   )
}