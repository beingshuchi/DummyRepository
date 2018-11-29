import axios from 'axios';

export class TableService {
    getSampleData(){
        return axios.get("sampleData/sampleTreaties.json").then(res => res.data.data);
        //.then(res => <ITreaties[]>res.data)
        //.then(data => { return data; });
                
    }

    getStatus(){
        return [
          { label : 'Study', value: 'study'},
          { label : 'Finalized', value: 'finalized'},
          { label : 'Prospect', value: 'prospect'},
          { label : 'To Validate', value: 'To Validate'},
          { label : 'Authorized', value: 'authorized'},
          { label : 'Renewed', value: 'renewed'},
          { label : 'accepted', value: 'accepted'}
        ] 
      }
}
