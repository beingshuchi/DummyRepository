import React from 'react';
import SearchForm from './SearchForm';
import "primeflex/primeflex.css";
import {Card} from 'primereact/card';
import  {Fa} from "mdbreact";
import './search.css';
import "primeflex/primeflex.css";
import "primereact/components/card/Card.css";

export class TreatySearch extends React.Component{
    render(){
        return (
            <div>
                <form>
            
            <Card className="b0">
            <div className="p-grid p-nogutter">
            <div className="p-col-11">
            <div className="p-grid p-nogutter">
            <div className="p-col-6 p-md-6 p-lg-3">
                <h3>Treaty Search</h3>
            </div>
              <div className="p-col-6 p-md-1 p-lg-2 p-offset-7">
                <button type="reset" className="b1" >Reset fields</button>
              </div>
              <div className="p-col-10">
              <SearchForm />
              </div>
              <div className="p-col-2"></div>
              </div>
              </div>
              <div className="p-col-1">
              <button type="submit" className="b3">
              <Fa icon="search" />
              </button>
             </div>
             </div>
             </Card>
             
             </form>
            </div>
        );
        
    }
}

export default TreatySearch;