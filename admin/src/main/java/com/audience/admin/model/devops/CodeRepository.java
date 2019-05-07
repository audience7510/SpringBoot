package com.audience.admin.model.devops;

import java.util.Date;

/**
 * 版本库管理表
 * @author wgy
 */
public class CodeRepository {
	/**主键*/
	private int id;
	/**代码库类型（svn/git）*/
	private String type;
	/**代码库名称*/
	private String name;
	/**代码库地址*/
	private String path;
	/**创建人*/
	private String createId;
	/**创建时间*/
	private Date createTime;
	/**修改时间*/
	private String updateTime;
	/**描述信息*/
	private String description;
	/**源分支路径(被创建分支的基线)*/
	private String baseBranchUrl;
	/**被创建分支的路径*/
	private String createBranchUrl;
	/**svn用户名*/
	private String userName;
	/**svn密码*/
	private String passWord;
	/**svn版本号*/
	private String rivision;
	/**svn基线版本号*/
    private String baseRivision;
	/**分支名称*/
	private String branchName;
	/**目标分支名称*/
	private String destBranchName;
	/**git/svn本地库地址*/
	private String localDir;
	/**描述信息*/
	private String descriptions;
	/**查询的commit log数量*/
	private Integer logCount;
	/** 本地代码库的某个目录的相对路径 */
    private String dir;
	/** 分支状态*/
	private String branchState;
	/**操作系统类型*/
	private Integer serverType;
	private String engineId;
	private String engineUrl;
	/**创建还是导入*/
	private String manageType;
	private String os;
	private String authUsers;//非数据库字段
	/**业务应用信息*/
	private String systemId;
	private String systemName;
	private String codeLineId;
	private String codeLineName;
	private String codeLineEnName;
	private String branchType;//分支模式
	private String useStatus;//分支使用状态
	private String moduleId;//工程Id
	private String moduleName;//工程名称
	/**分支同步相关参数*/
	private String srcCodeLine;
	private String srcCodeLineCh;
	private String targetCodeLine;
	private String targetCodeLineCh;
	private Integer syncType	;
	private String strategy;//分支策略0:环境分支策略，1:并行分支策略
	private String envBranchStrs; //待创建的环境分支拼成的字符串
	private String gitLabGroup;
	private String gitLabUser;
	private String state;
	/** 设置的巡检时间 */
    private Integer patrolStrategy;
    /** tag名称 */
    private String tagName;
    private String userIds;
    private String auth;
    private String orgId;
    private String differenceName;
    private String engineCategoryId;
    private String engineTypeid;
    private String codeRepPath;
    private String pjCustomAttributeName;
    private String pjCustomAttributeValue;
    private String svnServerEngineId;

    public String getBaseRivision()
    {
        return baseRivision;
    }
    public void setBaseRivision(String baseRivision)
    {
        this.baseRivision = baseRivision;
    }
    public String getDir()
    {
        return dir;
    }
    public void setDir(String dir)
    {
        this.dir = dir;
    }
    public String getSvnServerEngineId()
    {
        return svnServerEngineId;
    }

    public void setSvnServerEngineId(String svnServerEngineId)
    {
        this.svnServerEngineId = svnServerEngineId;
    }

    public String getPjCustomAttributeName() {
		return pjCustomAttributeName;
	}

	public void setPjCustomAttributeName(String pjCustomAttributeName) {
		this.pjCustomAttributeName = pjCustomAttributeName;
	}

	public String getPjCustomAttributeValue() {
		return pjCustomAttributeValue;
	}

	public void setPjCustomAttributeValue(String pjCustomAttributeValue) {
		this.pjCustomAttributeValue = pjCustomAttributeValue;
	}

	public String getEngineCategoryId() {
		return engineCategoryId;
	}

	public void setEngineCategoryId(String engineCategoryId) {
		this.engineCategoryId = engineCategoryId;
	}

	public String getEngineTypeid() {
		return engineTypeid;
	}

	public void setEngineTypeid(String engineTypeid) {
		this.engineTypeid = engineTypeid;
	}

	public String getCodeRepPath() {
		return codeRepPath;
	}

	public void setCodeRepPath(String codeRepPath) {
		this.codeRepPath = codeRepPath;
	}

	public String getDifferenceName() {
		return differenceName;
	}

	public void setDifferenceName(String differenceName) {
		this.differenceName = differenceName;
	}

	public String getOrgId()
    {
        return orgId;
    }
    public void setOrgId(String orgId)
    {
        this.orgId = orgId;
    }
    public String getAuth()
    {
        return auth;
    }
    public void setAuth(String auth)
    {
        this.auth = auth;
    }
    public String getUserIds()
    {
        return userIds;
    }
    public void setUserIds(String userIds)
    {
        this.userIds = userIds;
    }
    public String getSrcCodeLineCh() {
		return srcCodeLineCh;
	}
	public void setSrcCodeLineCh(String srcCodeLineCh) {
		this.srcCodeLineCh = srcCodeLineCh;
	}
	public String getTargetCodeLineCh() {
		return targetCodeLineCh;
	}
	public void setTargetCodeLineCh(String targetCodeLineCh) {
		this.targetCodeLineCh = targetCodeLineCh;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
    public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public String getCodeLineEnName() {
		return codeLineEnName;
	}
	public void setCodeLineEnName(String codeLineEnName) {
		this.codeLineEnName = codeLineEnName;
	}
	//是否删除远端版本库
    private Integer delState;
	
	public Integer getDelState() {
		return delState;
	}
	public void setDelState(Integer delState) {
		this.delState = delState;
	}
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public Integer getPatrolStrategy() {
		return patrolStrategy;
	}
	public void setPatrolStrategy(Integer patrolStrategy) {
		this.patrolStrategy = patrolStrategy;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getGitLabGroup() {
		return gitLabGroup;
	}
	public void setGitLabGroup(String gitLabGroup) {
		this.gitLabGroup = gitLabGroup;
	}
	public String getGitLabUser() {
		return gitLabUser;
	}
	public void setGitLabUser(String gitLabUser) {
		this.gitLabUser = gitLabUser;
	}
	public String getEngineUrl() {
		return engineUrl;
	}
	public void setEngineUrl(String engineUrl) {
		this.engineUrl = engineUrl;
	}
	public Integer getLogCount() {
		return logCount;
	}
	public void setLogCount(Integer logCount) {
		this.logCount = logCount;
	}
	public String getEnvBranchStrs() {
		return envBranchStrs;
	}
	public void setEnvBranchStrs(String envBranchStrs) {
		this.envBranchStrs = envBranchStrs;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	public String getBranchState() {
		return branchState;
	}
	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}
	public Integer getSyncType() {
		return syncType;
	}
	public void setSyncType(Integer syncType) {
		this.syncType = syncType;
	}
	public String getSrcCodeLine() {
		return srcCodeLine;
	}
	public void setSrcCodeLine(String srcCodeLine) {
		this.srcCodeLine = srcCodeLine;
	}
	public String getTargetCodeLine() {
		return targetCodeLine;
	}
	public void setTargetCodeLine(String targetCodeLine) {
		this.targetCodeLine = targetCodeLine;
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getCodeLineId() {
		return codeLineId;
	}
	public void setCodeLineId(String codeLineId) {
		this.codeLineId = codeLineId;
	}
	public String getCodeLineName() {
		return codeLineName;
	}
	public void setCodeLineName(String codeLineName) {
		this.codeLineName = codeLineName;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getManageType() {
		return manageType;
	}
	public void setManageType(String manageType) {
		this.manageType = manageType;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getEngineId() {
		return engineId;
	}
	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}
	public Integer getServerType() {
		return serverType;
	}
	public void setServerType(Integer serverType) {
		this.serverType = serverType;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public String getLocalDir() {
		return localDir;
	}
	public void setLocalDir(String localDir) {
		this.localDir = localDir;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public String getRivision() {
		return rivision;
	}
	public void setRivision(String rivision) {
		this.rivision = rivision;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getBaseBranchUrl() {
		return baseBranchUrl;
	}
	public void setBaseBranchUrl(String baseBranchUrl) {
		this.baseBranchUrl = baseBranchUrl;
	}
	public String getCreateBranchUrl() {
		return createBranchUrl;
	}
	public void setCreateBranchUrl(String createBranchUrl) {
		this.createBranchUrl = createBranchUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthUsers() {
		return authUsers;
	}
	public void setAuthUsers(String authUsers) {
		this.authUsers = authUsers;
	}
	public String getDestBranchName() {
		return destBranchName;
	}
	public void setDestBranchName(String destBranchName) {
		this.destBranchName = destBranchName;
	}
	
}
