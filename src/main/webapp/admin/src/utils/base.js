const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm40y34/",
            name: "ssm40y34",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm40y34/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "乐儿乐社区生鲜团购系统"
        } 
    }
}
export default base
