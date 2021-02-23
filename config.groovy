/*
  ----------------------------------------
  patchSuite entries for Static Data Patch
  ----------------------------------------
*/

patchSuite_mdv = [
  'use-PATCH_NUMBER_CUSTOM-box',
  'run-all-patches'
]
patchSuite_mpd = [
  'use-PATCH_NUMBER_CUSTOM-box',
  'run-all-patches'
]

environments {
  azure {
    /*
       --------------
       Non-LIVE (mdv)
       --------------
    */

    mdv {
      buildMonitorViewsToAutomate = [
        [
          viewName: "ATCM Team Monitor",
          viewRegex: "(Team_ATCM_ccm-jobs_team_generic_pipelines_team_ansible_site_deploy.groovy)|(Team_ATCM_ccm-jobs_team_api_e2e_test_pipelines_atcm.groovy)|(Team_ATCM.ccm-jobs.validation.*)",
        ],
        [
          viewName: "SC Team Monitor",
          viewRegex: "(Team_SCSL_ccm-jobs_validation_pipeline.groovy_cpp.context.listing)|(Team_SCSL_ccm-jobs_validation_pipeline.groovy_cpp.context.hearing)",
        ]
      ]

      /*
         ------------------------------
         Environments For Feature-Teams
         ------------------------------
      */
      teamStacks = [
        [
          name: "ace",
          stacks: [
            [ name: 'steccm21'],
            [ name: 'steccm32']
          ]
        ],
        [
          name: "amendreshare",
          stacks: [
            [ name: 'steccm14'],
            [ name: 'steccm17']
          ]
        ],
        [
          name: "apps-r1",
          stacks: [
            [ name: 'steccm15'],
            [ name: 'steccm18'],
            [ name: 'steccm22']
          ]
        ],
        [
          name: "backdutygobfix",
          stacks: [
            [ name: 'steccm23']
          ]
        ],
        [
          name: "ptfor",
          stacks: [
            [ name: 'steccm21'],
            [ name: 'steccm32']
          ]
        ],
        [
          name: "cct-890",
          stacks: [
            [ name: 'steccm11'],
            [ name: 'steccm34']
          ]
        ],
        [
          name: "cpi-369",
          stacks: [
            [ name: 'steccm36']
          ]
        ],
        [
          name: "cpi-65",
          stacks: [
            [ name: 'steccm36']
          ]
        ],
        [
          name : "cpssearch",
          stacks: [
            [name: 'steccm35'],
            [name: 'steccm40']
          ]
        ],
        [
          name: "dd-4917",
          stacks: [
            [ name: 'steccm18'],
            [ name: 'steccm22']
          ]
        ],
        [
          name: "ddj",
          stacks: [
            [ name: 'steccm23']
          ]
        ],
        [
          name: "defence-application",
          stacks: [
            [ name: 'steccm12'],
            [ name: 'steccm09']
          ]
        ],
        [
          name: "extradition",
          stacks: [
            [ name: 'steccm14'],
            [ name: 'steccm17']
          ]
        ],
        [
          name: "vacate-hearing",
          stacks: [
            [ name: 'steccm16'],
            [ name: 'steccm25']
          ]
        ],
        [
          name: "laa",
          stacks: [
            [ name: 'steccm19' ]
          ]
        ],
        [
          name: "nationality",
          stacks: [
            [ name: 'steccm20'],
            [ name: 'steccm32']
          ]
        ],
        [
          name: "nowapps",
          stacks: [
            [ name: 'steccm15']
          ]
        ],
        [
          name: "stagingdartsuplift",
          stacks: [
            [ name: 'steccm34']
          ]
        ],
        [
          name: "tfldecom",
          stacks: [
            [ name: 'steccm03'],
            [ name: 'steccm05'],
            [ name: 'steccm06'],
            [ name: 'steccm08']
          ]
        ],
        [
          name: "interim",
          stacks: [
            [ name: 'steccm03'],
            [ name: 'steccm05'],
            [ name: 'steccm06'],
            [ name: 'steccm08']
          ]
        ],
        [
          name: "identify-cps-prosecutor",
          stacks: [
            [ name: 'steccm18'],
            [ name: 'steccm22']
          ]
        ],
        [
          name: "nowsdocsv2",
          stacks: [
            [ name: 'steccm34']
          ]
        ],
        [
          name: "spi2",
          stacks: [
            [ name: 'steccm09'],
            [ name: 'steccm12']
          ]
        ],
        [
          name: "pdkupgrade",
          stacks: [
            [ name: 'steccm28']
          ]
        ],
        [
          name: "perftestingfix",
          stacks: [
            [ name: 'steccm22'],
            [ name: 'steccm18']
          ]
        ],
        [
          name: "cmprompts",
          stacks: [
            [ name: 'steccm37'],
            [ name: 'steccm26'],
            [ name: 'steccm28'],
            [ name: 'steccm30']
          ]
        ],
        [
          name: "cwr9",
          stacks: [
            [ name: 'steccm02']
          ]
        ],
        [
          name: "cwr-35",
          stacks: [
            [ name: 'steccm14'],
            [ name: 'steccm17']
          ]
        ],
        [
          name: "cct-980",
          stacks: [
            [ name: 'steccm13']
          ]
        ],
        [
          name: "judge-list-corporate-defendant",
          stacks: [
            [ name: 'steccm34' ]
          ]
        ],
        [
          name: "dd3504",
          stacks: [
            [ name: 'steccm37' ]
          ]
        ],
        [
          name: "driverrecord",
          stacks: [
            [ name: 'steccm13' ]
          ]
        ],
        [
          name: "realtime",
          stacks: [
            [ name: 'steccm21' ],
            [ name: 'steccm32' ]
          ]
        ],
        [
          name: "remove-auth-service-references",
          stacks: [
            [ name: 'steccm34' ]
          ]
        ],
        [
          name  : "roi",
          stacks: [
            [name: 'steccm35'],
            [name: 'steccm40']
          ]
        ],
        [
          name: "RQA-1507",
          stacks: [
            [ name: 'steccm23' ]
          ]
        ],
        [
          name: "DEVOPS",
          stacks: [
            [ name: 'steccm01' ],
            [ name: 'steccm02' ],
            [ name: 'steccm03' ],
            [ name: 'steccm04' ],
            [ name: 'steccm05' ],
            [ name: 'steccm06' ],
            [ name: 'steccm07' ],
            [ name: 'steccm08' ],
            [ name: 'steccm09' ],
            [ name: 'steccm10' ],
            [ name: 'steccm11' ],
            [ name: 'steccm12' ],
            [ name: 'steccm13' ],
            [ name: 'steccm14' ],
            [ name: 'steccm15' ],
            [ name: 'steccm16' ],
            [ name: 'steccm17' ],
            [ name: 'steccm18' ],
            [ name: 'steccm19' ],
            [ name: 'steccm20' ],
            [ name: 'steccm21' ],
            [ name: 'steccm22' ],
            [ name: 'steccm23' ],
            [ name: 'steccm24' ],
            [ name: 'steccm25' ],
            [ name: 'steccm26' ],
            [ name: 'steccm27' ],
            [ name: 'steccm28' ],
            [ name: 'steccm29' ],
            [ name: 'steccm30' ],
            [ name: 'steccm31' ],
            [ name: 'steccm32' ],
            [ name: 'steccm33' ],
            [ name: 'steccm34' ],
            [ name: 'steccm35' ],
            [ name: 'steccm36' ],
            [ name: 'steccm37' ],
            [ name: 'steccm38' ],
            [ name: 'steccm39' ],
            [ name: 'steccm40' ],
            [ name: 'steccm41' ],
            [ name: 'steccm42' ]
          ]
        ],
        [
          name: "dd-7191",
          stacks: [
            [ name: 'steccm30' ]
          ]
        ],
        [
          name: "e2e",
          stacks: [
            [ name: 'steccm28' ],
            [ name: 'steccm36' ],
            [ name: 'steccm38' ],
            [ name: 'steccm41' ],
            [ name: 'steccm80' ]
          ]
        ],
        [
          name: "FRAMEWORK",
          stacks: [
            [ name: 'steccm01' ],
            [ name: 'steccm02' ],
            [ name: 'steccm21' ],
            [ name: 'steccm28' ],
            [ name: 'steccm06' ]
          ]
        ],
        [
          name: "featuretoggle",
          stacks: [
            [ name: 'steccm11' ],
            [ name: 'steccm36' ]
          ]
        ],
        [
          name: "featureloader",
          stacks: [
            [ name: 'steccm11' ],
            [ name: 'steccm36' ]
          ]
        ],
        [
          name: "legacy",
          stacks: [
            [ name: 'steccm12' ]
          ]
        ],
        [
          name: "mcc",
          stacks: [
            [ name: 'steccm11' ],
            [ name: 'steccm35' ],
          ]
        ],
        [
          name: "multihander",
          stacks: [
            [ name: 'steccm12' ],
            [ name: 'steccm26' ],
            [ name: 'steccm37' ],
          ]
        ],
        [
          name: "nows",
          stacks: [
            [ name: 'steccm19' ],
            [ name: 'steccm15' ],
            [ name: 'steccm18' ],
            [ name: 'steccm22' ]
          ]
        ],
        [
          name: "Refdata",
          stacks: [
            [ name: 'steccm01' ],
            [ name: 'steccm04' ],
            [ name: 'steccm07' ],
            [ name: 'steccm33' ]
          ]
        ],
        [
          name: "REFDATA2",
          stacks: [
            [ name: 'steccm04' ],
            [ name: 'steccm07' ]
          ]
        ],
        [
          name: "SCMI",
          stacks: [
            [ name: 'steccm01' ],
            [ name: 'steccm04' ],
            [ name: 'steccm07' ],
            [ name: 'steccm33' ]
          ]
        ],
        [
          name: "SCMI-1091",
          stacks: [
            [ name: 'steccm07' ]
          ]
        ],
        [
          name: "stable-regression-tests",
          stacks: [
            [ name: 'steccm18' ]
          ]
        ],
        [
          name: "statdecs",
          stacks: [
            [ name: 'steccm03' ],
            [ name: 'steccm05' ],
            [ name: 'steccm06' ],
            [ name: 'steccm08' ]
          ]
        ],
        [
          name: "atcmbugfix",
          stacks: [
            [ name: 'steccm03' ],
            [ name: 'steccm04' ],
            [ name: 'steccm06' ],
            [ name: 'steccm08' ],
            [ name: 'steccm22' ]
          ]
        ],
        [
          name: "gpe-15250",
          stacks: [
            [ name: 'steccm37' ]
          ]
        ],
        [
          name: "sendingcourt",
          stacks: [
            [ name: 'steccm14' ],
            [ name: 'steccm17' ]
          ]
        ],
        [
          name: "se-95",
          stacks: [
            [ name: 'steccm23' ]
          ]
        ],
        [
          name: "twif",
          stacks: [
            [ name: 'steccm09' ],
            [ name: 'steccm12' ]
          ]
        ],
        [
          name: "accessibility",
          stacks: [
            [ name: 'steccm19' ],
            [ name: 'steccm28' ],
            [ name: 'steccm23' ],
            [ name: 'steccm30' ]
          ]
        ],
        [
          name: "apps-r2",
          stacks: [
            [ name: 'steccm15' ],
            [ name: 'steccm18' ],
            [ name: 'steccm22' ]
          ]
        ]
      ]

      /*
         ----------------------------------
         Environments NOT for Feature-Teams
         ----------------------------------
      */
      ste_environments = [ '---' ]
      teamStacks.each { team ->
        team.stacks.each { stacks ->
            ste_environments.add(stacks.name)
        }
      }
      ste_environments = ste_environments.sort().unique( false )

      dev_environments = [
          '---',
          'devccm01',
          'devccm02',
          'devccm03',
          'devccm04',
          'devccm05',
          'devccm06',
          'devccm07',
          'devccm08',
          'devccm10',
          'devccm11',
          'devccm12',
          'devccm13',
          'devccm14',
          'devccm15',
          'devccm16',
          'devccm17',
          'devccm19',
          'devccm20',
          'devccm21',
      ]
      dev_api_environments = [
          '---',
          'devccm11',
          'devccm12',
          'devccm13',
          'devccm14',

      ]
      dev_wfm_environments = [
          'devwfm01',
          'devwfm02',
      ]
      ste_wfm_environments = [
          'stewfm01',
          'stewfm02',
      ]
      nft_environments = [
          '---',
          'nftccm01',
      ]
      cc_dmo_environments = [
          '---',
          'dmoccm02',
      ]
      atcm_dmo_environments = [
          '---',
          'dmoccm02',
      ]
      opami_dmo_environments = [
          '---',
          'dmoccm02',
      ]
      dmo_environments = [
          cc_dmo_environments,
          atcm_dmo_environments,
          opami_dmo_environments,
      ]
      dmo_environments = dmo_environments.flatten().unique( false )
      dmo_environments.sort()
      sit_environments = [
          '---',
          'sitccm01',
      ]

      // Trigger for ALL team branches
      gerritTriggerTeamBranchPattern = [ "reg_exp:team/.*" ]

      // Trigger for ALL team branches AND master
      gerritTriggerTeamAndMasterPattern = [ "reg_exp:team/.*","plain:master" ]

      pipelineViewsToAutomate = [
        [
          viewName: "Strategic Platform",
          viewRegex: "strategic_platform.*",
        ],
        [
          viewName: "Idam Jobs",
          viewRegex: "IDAM.*",
        ],
        [
          viewName: "OLP Jobs",
          viewRegex: "OLP.*",
        ],
        [
          viewName: "DevOps Jobs",
          viewRegex: "Devops_Jobs.*",
        ],
        [
          viewName: "Env - DMO",
          viewRegex: "dmo_environment.*",
        ],
        [
          viewName: "Env - DMO (Team)",
          viewRegex: "dmo_environment_Team.*",
        ],
        [
          viewName: "Env - STE",
          viewRegex: "standard_test_environment.*",
        ],
        [
          viewName: "Env - DEV",
          viewRegex: "dev_environment.*",
        ],
        [
          viewName: "Env - SIT",
          viewRegex: "sit_environment.*",
        ],
        [
          viewName: "Env - NFT",
          viewRegex: "nft_environment.*",
        ],
        [
          viewName: "Pipeline - Parallel",
          viewRegex: "Pipeline_Parallel.*",
        ],
        [
          viewName: "Api Test",
          viewRegex: "api_test.*",
        ],
        [
          viewName: "Pipeline - Validation",
          viewRegex: "master_validation_build.*",
        ],
        [
          viewName: "Team TEAMNAME",
          viewRegex: "Team_TEAMNAME.*",
        ],
        [
          viewName: "Verify - Master",
          viewRegex: "verify_master.*",
        ],
        [
          viewName: "Verify - Team",
          viewRegex: "verify_team.*",
        ],
        [
          viewName: "Temporary jobs",
          viewRegex: "temporary_jobs.*",
        ],
        [
          viewName: "Platform Library",
          viewRegex: "platform_library.*",
        ],
        [
          viewName: "Platform Framework",
          viewRegex: "platform_framework.*",
        ],
        [
          viewName: "Platform UI",
          viewRegex: "platform_ui.*",
        ],
        [
          viewName: "Ext Release",
          viewRegex: "Ext_Release.*",
        ],
        [
          viewName: "Env - ROTA",
          viewRegex: "rota_environment.*",
        ],
        [
          viewName: "Env - ATL",
          viewRegex: "atl_environment.*",
        ],
      ]
      pipelinesToAutomate = [
        [
          pipelineJob: "strategic-platform/run_terraform_plan_nlv.groovy",
          pipelineName: "Terraform Plan",
          description: "Run terraform plan against all MGMT and DMZ areas)",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '00 6 * * 1-5',
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/master_build_terraform_nlv.groovy",
          pipelineName: "Terraform",
          description: "Run terraform plan (and optional apply against all MGMT and DMZ areas)",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/master_build_ansible_nlv.groovy",
          pipelineName: "Ansible - Basic",
          description: "This job runs Site on all management machines for all non-live environments on a Cron Job",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/adhoc_build_ansible.groovy",
          pipelineName: "Ansible - AdHoc",
          description: "Runs an arbitrary ansible playbook against management areas with supplied parameters",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Devops_Jobs",
        ],
        [
          pipelineJob: "strategic-platform/extract_release_delta.groovy",
          pipelineName: "Extract Release Delta",
          description: "Gets all commits between two versions of a pipeline",
          repos: [
            [
               repo: "cpp.pipeline",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
        ],
        [
          pipelineJob: "strategic-platform/apim_tasks_nlv.groovy",
          pipelineName: "APIM Tasks",
          description: "Run APIM tasks against given env(s))",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '0 0 * * *',
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/az_tasks_nlv.groovy",
          pipelineName: "FunctionApp Log Stream Tasks",
          description: "Run Log Stream Log task against selected FunctionApp",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "ccm-jobs/create_feature_pipeline.groovy",
          pipelineName: "Create Feature Pipeline",
          description: "Creates feature pipeline in Gerrit e.g. cpp.pipeline.boxwork and team branches within it.",
          repos: [
            [
               repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Devops_Jobs",
        ],
        [
          pipelineJob: "strategic-platform/upload_to_sa.groovy",
          pipelineName: "Upload JSON File to Azure Storage Account",
          description: "Lets you upload the contents of a JSON file to an Azure storage account using ansible and azure_rm_storageblob.",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotification: "sp-notifications",
          view: "Devops_Jobs",
        ],
        [
          pipelineJob: "strategic-platform/update_artifact_tags.groovy",
          pipelineName: "Update Artifact Tags",
          description: "Unused jobs. Intended to update the tags associated with a named artifact in artifactory",
          repos: [
            [
               repo: "cpp.pipeline",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
        ],
        [
          pipelineJob: "strategic-platform/azure_rm_inventory_clear_cache.groovy",
          pipelineName: "Invalidate Ansible Inventory Cache",
          description: "Removes the ansible inventory cache file (as used by ansibleDeployV2) to force a full inventory on next run",
          repos: [
            [
               repo: "automation.ansible",
            ]
          ],
          envs: [
            [
               name: "all",
            ],
            [
               name: "ste",
            ],
            [
               name: "dev",
            ],
            [
               name: "nft",
            ],
            [
               name: "sit",
            ],
            [
               name: "mdv",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_full_environment_start.groovy",
          pipelineName: "Controlled Environment Start-up",
          description: "This job starts up the applications in order on a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "ccm-jobs/ccm_full_environment_shutter.groovy",
          pipelineName: "Controlled Environment Shutter",
          description: "This job shutters a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "ccm-jobs/terraform_pipelines/ste/ste_core_terraform.groovy",
          pipelineName: "STE Core Terraform",
          description: "This job runs terraform against the STE Core Layer",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "standard_test_environment"
        ],
        [
          pipelineJob: "ccm-jobs/terraform_pipelines/ste/ste_create_stack.groovy",
          pipelineName: "STE Create Stack",
          description: "This job creates a new STE Stack VMs",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "standard_test_environment"
        ],
        [
          pipelineJob: "ccm-jobs/terraform_pipelines/ste/ste_destroy_stack.groovy",
          pipelineName: "STE Destroy Stack",
          description: "This job destroys a STE Stacks VMs",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "standard_test_environment"
        ],
        [
          pipelineJob: "ccm-jobs/terraform_pipelines/ste/ste_refresh_stacks.groovy",
          pipelineName: "STE Refresh Stacks",
          description: "This job runs terraform against the STE CCM VMs without rebuilding them",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "standard_test_environment"
        ],
        [
          pipelineJob: "ccm-jobs/full_inspec.groovy",
          pipelineName: "Run Full Inspec suite",
          description: "Runs the inspec tests against a given stack to validate the environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_site_deploy.groovy",
          pipelineName: "Environment Site Deploy",
          description: "This job provisions a full stack (or limited subset of hosts) with the site (system) and deploy (application) components",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ],
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_site_deploy_v2.groovy",
          pipelineName: "Environment Site Deploy v2 (BETA)",
          description: "This job provisions a full stack (or limited subset of hosts) with the site (system) and deploy (application) components",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
//            [
//              name: "DMO",
//              stacks: dmo_environments,
//              view: "dmo_environment"
//            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
//            [
//              name: "SIT",
//              stacks: sit_environments,
//              view: "sit_environment"
//            ],
//            [
//              name: "NFT",
//              stacks: nft_environments,
//              view: "nft_environment"
//            ],
          ],
          deploymentTypes: [ 'SiteDeploy', 'DeployOnly', 'None' ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_idam_deploy.groovy",
          pipelineName: "Environment IDAM Deploy",
          description: "Deploys the IDAM machines for a given Stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_aem_create_users.groovy",
          pipelineName: "Environment Create AEM Users",
          description: "Provision a supplied AEM User for a stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/trigger.groovy",
          pipelineName: "Trigger ALL Parallel Pipelines",
          description: "Trigger the parallel pipeline for all team branches",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/api.groovy",
          pipelineName: "API Parallel Pipeline",
          description: "API tests for parallel pipeline",
          repos: [
            [
              repo: "cpp.apitests",
            ]
          ],
          parallel_environments: dev_api_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/atcm.groovy",
          pipelineName: "ATCM Parallel Pipeline",
          description: "ATCM tests for parallel pipeline",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/c2i.groovy",
          pipelineName: "C2I Parallel Pipeline",
          description: "C2I tests for parallel pipeline",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/cc.groovy",
          pipelineName: "CC Parallel Pipeline",
          description: "CC tests for parallel pipeline",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/FRAMEWORK.groovy",
          pipelineName: "FRAMEWORK Parallel Pipeline",
          description: "FRAMEWORK tests for parallel pipeline",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/parallel_pipelines/opami.groovy",
          pipelineName: "OPAMI Parallel Pipeline",
          description: "OPAMI tests for parallel pipeline",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          parallel_environments: dev_environments,
          view: "Pipeline_Parallel",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_apitest_build_pipeline.groovy",
          pipelineName: "Api Release",
          description: "pipeline for apitest repo",
          customRepoBuild: true,
          repos: [
            [
              name: "cpp_api_test",
              repo: "cpp.apitests",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "api_test",
        ],
        [
          pipelineJob: "ccm-jobs/validation_pipeline.groovy",
          pipelineName: "Master Branch Validation Pipeline",
          description: "Runs the validation of CRs merged against the master branch",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: "plain:master",
          repos: [
            [
              name: "applicationscourtorders",
              repo: "cpp.context.applications.courtorders",
            ],
            [
              name: "appconfigfeatureuploader",
              repo: "cpp.app.config.featureloader",
            ],
            [
              name: "assignment",
              repo: "cpp.context.assignment",
            ],
            [
              name: "audit",
              repo: "cpp.context.audit",
            ],
            [
              name: "authorisation-service",
              repo: "cpp.authorisation.service",
            ],
            [
              name: "boxworkmanagement",
              repo: "cpp.context.boxworkmanagement",
            ],
            [
              name: "businessprocesses",
              repo: "cpp.context.businessprocesses",
            ],
            [
              name: "cloudservicesfeaturetoggle",
              repo: "cpp.context.cloudservices.featuretoggle",
            ],
            [
              name: "appconfigfeatureloader",
              repo: "cpp.context.appconfig.featureloader",
            ],
            [
              name: "cpsapim",
              repo: "cpp.context.cps.apim",
            ],
            [
              name: "cpscasefile",
              repo: "cpp.context.cps.casefile",
            ],
            [
              name: "cpscasemanagement",
              repo: "cpp.context.cps.case.management",
            ],
            [
              name: "cpscasematerial",
              repo: "cpp.context.cps.case.material",
            ],
            [
              name: "cpsmireportdata",
              repo: "cpp.context.cps.mi.reportdata",
            ],
            [
              name: "cpsmisystemdata",
              repo: "cpp.context.cps.mi.systemdata",
            ],
            [
              name: "cpscaseparticipant",
              repo: "cpp.context.cps.case.participant",
            ],
            [
              name: "defence",
              repo: "cpp.context.defence",
            ],
            [
              name: "hearing",
              repo: "cpp.context.hearing",
            ],
            [
              name: "idam-events-consumer",
              repo: "cpp.idam.am.idam-events-consumer",
            ],
            [
              name: "idpc",
              repo: "cpp.context.dpc.idpc",
            ],
            [
              name: "listing",
              repo: "cpp.context.listing",
            ],
            [
              name: "material",
              repo: "cpp.context.material",
            ],
            [
              name: "mireportdata",
              repo: "cpp.context.mi.reportdata",
            ],
            [
              name: "misystemdata",
              repo: "cpp.context.mi.systemdata",
            ],
            [
              name: "notification",
              repo: "cpp.context.notification",
            ],
            [
              name: "notificationnotify",
              repo: "cpp.context.notification.notify",
            ],
            [
              name: "legalaidagency",
              repo: "cpp.context.azure.legalaidagency",
            ],
            [
              name: "people",
              repo: "cpp.context.people",
            ],
            [
              name: "progression",
              repo: "cpp.context.progression",
            ],
            [
              name: "prosecutioncasefile",
              repo: "cpp.context.prosecution.casefile",
            ],
            [
              name: "documentqueue",
              repo: "cpp.context.prosecution.documentqueue",
            ],
            [
              name: "stagingprosecutorscpsdocuments",
              repo: "cpp.context.staging.prosecutors.cpsdocuments",
            ],
            [
              name: "stagingprosecutorsspi",
              repo: "cpp.context.staging.prosecutors.spi",
            ],
            [
              name: "pssreferencedataoffences",
              repo: "cpp.context.pss.referencedata.offences",
            ],
            [
              name: "referencedata",
              repo: "cpp.context.reference-data",
            ],
            [
              name: "referencedataoffences",
              repo: "cpp.context.referencedata.offences",
            ],
            [
              name: "resulting",
              repo: "cpp.context.resulting",
            ],
            [
              name: "results",
              repo: "cpp.context.results",
            ],
            [
              name: "rotasl",
              repo: "cpp.context.rotasl",
            ],
            [
              name: "scheduling",
              repo: "cpp.context.scheduling",
            ],
            [
              name: "sjp",
              repo: "cpp.context.sjp",
            ],
            [
              name: "staging",
              repo: "cpp.context.staging",
            ],
            [
              name: "stagingcps",
              repo: "cpp.context.staging.cps",
            ],
            [
              name: "stagingdarts",
              repo: "cpp.context.staging.darts",
            ],
            [
              name: "stagingdvla",
              repo: "cpp.context.staging.dvla",
            ],
            [
              name: "stagingtfl",
              repo: "cpp.context.staging.tfl",
            ],
            [
              name: "stagingenforcement",
              repo: "cpp.context.staging.enforcement",
            ],
            [
              name: "stagingprosecutors",
              repo: "cpp.context.staging.prosecutors",
            ],
            [
              name: "stagingpnldoffences",
              repo: "cpp.context.staging.pnld-offences",
            ],
            [
              name: "support",
              repo: "cpp.context.support",
            ],
            [
              name: "systemdocgenerator",
              repo: "cpp.context.system.doc-generator",
            ],
            [
              name: "system-documentgenerator",
              repo: "cpp.context.system.documentgenerator",
            ],
            [
              name: "systemscheduling",
              repo: "cpp.context.system.scheduling",
            ],
            [
              name: "system-id-mapper",
              repo: "cpp.context.system.id-mapper",
            ],
            [
              name: "usersgroups",
              repo: "cpp.context.users-groups",
            ],
            [
              name: "unifiedsearchquery",
              repo: "cpp.context.unifiedsearch.query",
            ],
            [
              name: "stagingbulkscan",
              repo: "cpp.context.staging.bulkscan",
            ],
            [
              name: "stagingxhibit",
              repo: "cpp.context.staging.xhibit",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "master_validation_build",
        ],
        [
          pipelineJob: "ccm-jobs/validation_pipeline.groovy",
          pipelineName: "Validation - TEAMNAME Team Branch",
          description: "Runs the validation of CRs merged against the TEAMNAME team branches",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: "plain:team/TEAMNAME",
          repos: [
            [
              name: "applicationscourtorders",
              repo: "cpp.context.applications.courtorders",
            ],
            [
              name: "appconfigfeatureuploader",
              repo: "cpp.app.config.featureloader",
            ],
            [
              name: "assignment",
              repo: "cpp.context.assignment",
            ],
            [
              name: "audit",
              repo: "cpp.context.audit",
            ],
            [
              name: "authorisation-service",
              repo: "cpp.authorisation.service",
            ],
            [
              name: "boxworkmanagement",
              repo: "cpp.context.boxworkmanagement",
            ],
            [
              name: "businessprocesses",
              repo: "cpp.context.businessprocesses",
            ],
            [
              name: "cloudservicesfeaturetoggle",
              repo: "cpp.context.cloudservices.featuretoggle",
            ],
            [
              name: "appconfigfeatureloader",
              repo: "cpp.context.appconfig.featureloader",
            ],
            [
              name: "cpsapim",
              repo: "cpp.context.cps.apim",
            ],
            [
              name: "cpscasefile",
              repo: "cpp.context.cps.casefile",
            ],
            [
              name: "cpscasemanagement",
              repo: "cpp.context.cps.case.management",
            ],
            [
              name: "cpscasematerial",
              repo: "cpp.context.cps.case.material",
            ],
            [
              name: "cpsmireportdata",
              repo: "cpp.context.cps.mi.reportdata",
            ],
            [
              name: "cpsmisystemdata",
              repo: "cpp.context.cps.mi.systemdata",
            ],
            [
              name: "cpscaseparticipant",
              repo: "cpp.context.cps.case.participant",
            ],
            [
              name: "defence",
              repo: "cpp.context.defence",
            ],
            [
              name: "hearing",
              repo: "cpp.context.hearing",
            ],
            [
              name: "idam-events-consumer",
              repo: "cpp.idam.am.idam-events-consumer",
            ],
            [
              name: "idpc",
              repo: "cpp.context.dpc.idpc",
            ],
            [
              name: "listing",
              repo: "cpp.context.listing",
            ],
            [
              name: "material",
              repo: "cpp.context.material",
            ],
            [
              name: "mireportdata",
              repo: "cpp.context.mi.reportdata",
            ],
            [
              name: "misystemdata",
              repo: "cpp.context.mi.systemdata",
            ],
            [
              name: "notification",
              repo: "cpp.context.notification",
            ],
            [
              name: "notificationnotify",
              repo: "cpp.context.notification.notify",
            ],
            [
              name: "legalaidagency",
              repo: "cpp.context.azure.legalaidagency",
            ],
            [
              name: "people",
              repo: "cpp.context.people",
            ],
            [
              name: "progression",
              repo: "cpp.context.progression",
            ],
            [
              name: "prosecutioncasefile",
              repo: "cpp.context.prosecution.casefile",
            ],
            [
              name: "documentqueue",
              repo: "cpp.context.prosecution.documentqueue",
            ],
            [
              name: "pssreferencedataoffences",
              repo: "cpp.context.pss.referencedata.offences",
            ],
            [
              name: "referencedata",
              repo: "cpp.context.reference-data",
            ],
            [
              name: "referencedataoffences",
              repo: "cpp.context.referencedata.offences",
            ],
            [
              name: "resulting",
              repo: "cpp.context.resulting",
            ],
            [
              name: "results",
              repo: "cpp.context.results",
            ],
            [
              name: "rotasl",
              repo: "cpp.context.rotasl",
            ],
            [
              name: "scheduling",
              repo: "cpp.context.scheduling",
            ],
            [
              name: "sjp",
              repo: "cpp.context.sjp",
            ],
            [
              name: "staging",
              repo: "cpp.context.staging",
            ],
            [
              name: "stagingcps",
              repo: "cpp.context.staging.cps",
            ],
            [
              name: "stagingdarts",
              repo: "cpp.context.staging.darts",
            ],
            [
              name: "stagingdvla",
              repo: "cpp.context.staging.dvla",
            ],
            [
              name: "stagingenforcement",
              repo: "cpp.context.staging.enforcement",
            ],
            [
              name: "stagingpnldoffences",
              repo: "cpp.context.staging.pnld-offences",
            ],
            [
              name: "stagingprosecutors",
              repo: "cpp.context.staging.prosecutors",
            ],
            [
              name: "stagingprosecutorscpsdocuments",
              repo: "cpp.context.staging.prosecutors.cpsdocuments",
            ],
            [
              name: "stagingprosecutorsspi",
              repo: "cpp.context.staging.prosecutors.spi",
            ],
            [
              name: "stagingtfl",
              repo: "cpp.context.staging.tfl",
            ],
            [
              name: "support",
              repo: "cpp.context.support",
            ],
            [
              name: "systemdocgenerator",
              repo: "cpp.context.system.doc-generator",
            ],
            [
              name: "system-documentgenerator",
              repo: "cpp.context.system.documentgenerator",
            ],
            [
              name: "system-id-mapper",
              repo: "cpp.context.system.id-mapper",
            ],
            [
              name: "systemscheduling",
              repo: "cpp.context.system.scheduling",
            ],
            [
              name: "unifiedsearchquery",
              repo: "cpp.context.unifiedsearch.query",
            ],
            [
              name: "stagingbulkscan",
              repo: "cpp.context.staging.bulkscan",
            ],
            [
              name: "usersgroups",
              repo: "cpp.context.users-groups",
            ],
            [
              name: "stagingxhibit",
              repo: "cpp.context.staging.xhibit",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Team_TEAMNAME",
        ],
        [
          pipelineJob: "ccm-jobs/verify.groovy",
          pipelineName: "Master Branch Verify Job",
          description: "Runs the Gerrit Verification of CRs created against the master branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false, //this should stay on silent until we migrate
          gerritTriggerBranchPattern: "plain:master",
          repos: [
            [
              name: "apitests",
              repo: "cpp.apitests",
            ],
            [
              name: "appconfigfeatureuploader",
              repo: "cpp.app.config.featureloader",
            ],
            [
              name: "applicationscourtorders",
              repo: "cpp.context.applications.courtorders",
            ],
            [
              name: "assignment",
              repo: "cpp.context.assignment",
            ],
            [
              name: "audit",
              repo: "cpp.context.audit",
            ],
            [
              name: "authorisation-service",
              repo: "cpp.authorisation.service",
            ],
            [
              name: "boxworkmanagement",
              repo: "cpp.context.boxworkmanagement",
            ],
            [
              name: "businessprocesses",
              repo: "cpp.context.businessprocesses",
            ],
            [
              name: "cloudservicesfeaturetoggle",
              repo: "cpp.context.cloudservices.featuretoggle",
            ],
            [
              name: "appconfigfeatureloader",
              repo: "cpp.context.appconfig.featureloader",
            ],
            [
              name: "cpsapim",
              repo: "cpp.context.cps.apim",
            ],
            [
              name: "cpscasefile",
              repo: "cpp.context.cps.casefile",
            ],
            [
              name: "cpscasemanagement",
              repo: "cpp.context.cps.case.management",
            ],
            [
              name: "cpscasematerial",
              repo: "cpp.context.cps.case.material",
            ],
            [
              name: "cpsmireportdata",
              repo: "cpp.context.cps.mi.reportdata",
            ],
            [
              name: "cpsmisystemdata",
              repo: "cpp.context.cps.mi.systemdata",
            ],
            [
              name: "cpscaseparticipant",
              repo: "cpp.context.cps.case.participant",
            ],
            [
              name: "defence",
              repo: "cpp.context.defence",
            ],
            [
              name: "system-documentgenerator",
              repo: "cpp.context.system.documentgenerator",
            ],
            [
              name: "hearing",
              repo: "cpp.context.hearing",
            ],
            [
              name: "idam-events-consumer",
              repo: "cpp.idam.am.idam-events-consumer",
            ],
            [
              name: "idpc",
              repo: "cpp.context.dpc.idpc",
            ],
            [
              name: "listing",
              repo: "cpp.context.listing",
            ],
            [
              name: "material",
              repo: "cpp.context.material",
            ],
            [
              name: "mireportdata",
              repo: "cpp.context.mi.reportdata",
            ],
            [
              name: "misystemdata",
              repo: "cpp.context.mi.systemdata",
            ],
            [
              name: "notification",
              repo: "cpp.context.notification",
            ],
            [
              name: "notificationnotify",
              repo: "cpp.context.notification.notify",
            ],
            [
              name: "legalaidagency",
              repo: "cpp.context.azure.legalaidagency",
            ],
            [
              name: "people",
              repo: "cpp.context.people",
            ],
            [
              name: "progression",
              repo: "cpp.context.progression",
            ],
            [
              name: "prosecutioncasefile",
              repo: "cpp.context.prosecution.casefile",
            ],
            [
              name: "documentqueue",
              repo: "cpp.context.prosecution.documentqueue",
            ],
            [
              name: "pssreferencedataoffences",
              repo: "cpp.context.pss.referencedata.offences",
            ],
            [
              name: "referencedata",
              repo: "cpp.context.reference-data",
            ],
            [
              name: "referencedataoffences",
              repo: "cpp.context.referencedata.offences",
            ],
            [
              name: "resulting",
              repo: "cpp.context.resulting",
            ],
            [
              name: "results",
              repo: "cpp.context.results",
            ],
            [
              name: "rotasl",
              repo: "cpp.context.rotasl",
            ],
            [
              name: "scheduling",
              repo: "cpp.context.scheduling",
            ],
            [
              name: "sjp",
              repo: "cpp.context.sjp",
            ],
            [
              name: "staging",
              repo: "cpp.context.staging",
            ],
            [
              name: "stagingcps",
              repo: "cpp.context.staging.cps",
            ],
            [
              name: "stagingdarts",
              repo: "cpp.context.staging.darts",
            ],
            [
              name: "stagingdvla",
              repo: "cpp.context.staging.dvla",
            ],
            [
              name: "stagingtfl",
              repo: "cpp.context.staging.tfl",
            ],
            [
              name: "stagingenforcement",
              repo: "cpp.context.staging.enforcement",
            ],
            [
              name: "stagingpnldoffences",
              repo: "cpp.context.staging.pnld-offences",
            ],
            [
              name: "stagingprosecutors",
              repo: "cpp.context.staging.prosecutors",
            ],
            [
              name: "stagingprosecutorsspi",
              repo: "cpp.context.staging.prosecutors.spi",
            ],
            [
              name: "stagingprosecutorscpsdocuments",
              repo: "cpp.context.staging.prosecutors.cpsdocuments",
            ],
            [
              name: "support",
              repo: "cpp.context.support",
            ],
            [
              name: "systemdocgenerator",
              repo: "cpp.context.system.doc-generator",
            ],
            [
              name: "systemscheduling",
              repo: "cpp.context.system.scheduling",
            ],
            [
              name: "system-id-mapper",
              repo: "cpp.context.system.id-mapper",
            ],
            [
              name: "usersgroups",
              repo: "cpp.context.users-groups",
            ],
            [
              name: "stagingbulkscan",
              repo: "cpp.context.staging.bulkscan",
            ],
            [
              name: "unifiedsearchquery",
              repo: "cpp.context.unifiedsearch.query",
            ],
            [
              name: "stagingxhibit",
              repo: "cpp.context.staging.xhibit",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "verify_master",
        ],
        [
          pipelineJob: "ccm-jobs/verify.groovy",
          pipelineName: "Team Branch Verify Job",
          description: "Runs the Gerrit Verification of CRs made against the team branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false, //this should stay on silent until we migrate
          gerritTriggerBranchPattern: gerritTriggerTeamBranchPattern,
          repos: [
            [
              name: "apitests",
              repo: "cpp.apitests",
            ],
            [
              name: "appconfigfeatureuploader",
              repo: "cpp.app.config.featureloader",
            ],
            [
              name: "applicationscourtorders",
              repo: "cpp.context.applications.courtorders",
            ],
            [
              name: "assignment",
              repo: "cpp.context.assignment",
            ],
            [
              name: "audit",
              repo: "cpp.context.audit",
            ],
            [
              name: "authorisation-service",
              repo: "cpp.authorisation.service",
            ],
            [
              name: "boxworkmanagement",
              repo: "cpp.context.boxworkmanagement",
            ],
            [
              name: "businessprocesses",
              repo: "cpp.context.businessprocesses",
            ],
            [
              name: "cloudservicesfeaturetoggle",
              repo: "cpp.context.cloudservices.featuretoggle",
            ],
            [
              name: "appconfigfeatureloader",
              repo: "cpp.context.appconfig.featureloader",
            ],
            [
              name: "cpsapim",
              repo: "cpp.context.cps.apim",
            ],
            [
              name: "cpscasefile",
              repo: "cpp.context.cps.casefile",
            ],
            [
              name: "cpscasemanagement",
              repo: "cpp.context.cps.case.management",
            ],
            [
              name: "cpscasematerial",
              repo: "cpp.context.cps.case.material",
            ],
            [
              name: "cpsmireportdata",
              repo: "cpp.context.cps.mi.reportdata",
            ],
            [
              name: "cpsmisystemdata",
              repo: "cpp.context.cps.mi.systemdata",
            ],
            [
              name: "cpscaseparticipant",
              repo: "cpp.context.cps.case.participant",
            ],
            [
              name: "defence",
              repo: "cpp.context.defence",
            ],
            [
              name: "system-documentgenerator",
              repo: "cpp.context.system.documentgenerator",
            ],
            [
              name: "hearing",
              repo: "cpp.context.hearing",
            ],
            [
              name: "idam-events-consumer",
              repo: "cpp.idam.am.idam-events-consumer",
            ],
            [
              name: "idpc",
              repo: "cpp.context.dpc.idpc",
            ],
            [
              name: "listing",
              repo: "cpp.context.listing",
            ],
            [
              name: "material",
              repo: "cpp.context.material",
            ],
            [
              name: "mireportdata",
              repo: "cpp.context.mi.reportdata",
            ],
            [
              name: "misystemdata",
              repo: "cpp.context.mi.systemdata",
            ],
            [
              name: "notification",
              repo: "cpp.context.notification",
            ],
            [
              name: "notificationnotify",
              repo: "cpp.context.notification.notify",
            ],
            [
              name: "legalaidagency",
              repo: "cpp.context.azure.legalaidagency",
            ],
            [
              name: "people",
              repo: "cpp.context.people",
            ],
            [
              name: "progression",
              repo: "cpp.context.progression",
            ],
            [
              name: "prosecutioncasefile",
              repo: "cpp.context.prosecution.casefile",
            ],
            [
              name: "documentqueue",
              repo: "cpp.context.prosecution.documentqueue",
            ],
            [
              name: "pssreferencedataoffences",
              repo: "cpp.context.pss.referencedata.offences",
            ],
            [
              name: "referencedata",
              repo: "cpp.context.reference-data",
            ],
            [
              name: "referencedataoffences",
              repo: "cpp.context.referencedata.offences",
            ],
            [
              name: "resulting",
              repo: "cpp.context.resulting",
            ],
            [
              name: "results",
              repo: "cpp.context.results",
            ],
            [
              name: "rotasl",
              repo: "cpp.context.rotasl",
            ],
            [
              name: "scheduling",
              repo: "cpp.context.scheduling",
            ],
            [
              name: "sjp",
              repo: "cpp.context.sjp",
            ],
            [
              name: "staging",
              repo: "cpp.context.staging",
            ],
            [
              name: "stagingcps",
              repo: "cpp.context.staging.cps",
            ],
            [
              name: "stagingdarts",
              repo: "cpp.context.staging.darts",
            ],
            [
              name: "stagingdvla",
              repo: "cpp.context.staging.dvla",
            ],
            [
              name: "stagingtfl",
              repo: "cpp.context.staging.tfl",
            ],
            [
              name: "stagingenforcement",
              repo: "cpp.context.staging.enforcement",
            ],
            [
              name: "stagingpnldoffences",
              repo: "cpp.context.staging.pnld-offences",
            ],
            [
              name: "stagingprosecutors",
              repo: "cpp.context.staging.prosecutors",
            ],
            [
              name: "stagingprosecutorsspi",
              repo: "cpp.context.staging.prosecutors.spi",
            ],
            [
              name: "stagingprosecutorscpsdocuments",
              repo: "cpp.context.staging.prosecutors.cpsdocuments",
            ],
            [
              name: "support",
              repo: "cpp.context.support",
            ],
            [
              name: "systemdocgenerator",
              repo: "cpp.context.system.doc-generator",
            ],
            [
              name: "systemscheduling",
              repo: "cpp.context.system.scheduling",
            ],
            [
              name: "system-id-mapper",
              repo: "cpp.context.system.id-mapper",
            ],
            [
              name: "unifiedsearchquery",
              repo: "cpp.context.unifiedsearch.query",
            ],
            [
              name: "stagingbulkscan",
              repo: "cpp.context.staging.bulkscan",
            ],
            [
              repo: "cpp.context.users-groups",
              name: "usersgroups",
            ],
            [
              name: "stagingxhibit",
              repo: "cpp.context.staging.xhibit",
            ],
            [
              name: "priming",
              repo: "cpp.platform.priming",
            ],
          ],
          slackNotifications: "sp-notifications",
          view: "verify_team",
        ],
        [
          pipelineJob: "ccm-jobs/ui_verify.groovy",
          pipelineName: "Master Branch Verify UI Job",
          description: "Runs the Gerrit Verification of UI CRs made against the master branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false, //this should stay on silent until we migrate
          gerritTriggerBranchPattern: "plain:master",
          repos: [
            [
              repo: "cpp.ui.external.services",
              name: "ui_external_services",
            ],
            [
              repo: "cpp.ui.admin",
              name: "ui.admin",
            ],
            [
              repo: "cpp.ui.c2i",
              name: "ui.c2i",
            ],
            [
              repo: "cpp.ui.cps.mcc",
              name: "ui_cps_mcc",
            ],
            [
              repo: "cpp.ui.defence",
              name: "ui.defence",
            ],
            [
              repo: "cpp.ui.hearing",
              name: "ui.hearing",
            ],
            [
              repo: "cpp.ui.listing",
              name: "ui.listing",
            ],
            [
              repo: "cpp.ui.prosecution.casefile",
              name: "ui.prosecution.casefile",
            ],
            [
              repo: "cpp.ui.results",
              name: "ui.results",
            ],
            [
              repo: "ui.app",
              name: "ui app",
            ],
            [
              repo: "cpp.ui.workflow-management",
              name: "ui.workflow-management",
            ],
            [
              repo: "cpp.ui.opami",
              name: "ui.opami",
            ],
            [
              repo: "cpp.ui.sjp",
              name: "ui.sjp",
            ],
            [
              repo: "cpp.ui.home",
              name: "ui.home",
            ],
            [
              name: "onlineplea",
              repo: "cpp.ui.online-plea",
            ],
            [
              repo: "cpp.ui.prosecutor",
              name: "ui.prosecutor",
            ],
            [
              repo: "cpp.ui.bulkscan",
              name: "ui.bulkscan",
            ],
            [
              repo: "cpp.ui.managepermissions",
              name: "ui.managepermissions",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "verify_master",
        ],
        [
          pipelineJob: "ccm-jobs/ui_verify.groovy",
          pipelineName: "Team Branch Verify UI Job",
          description: "Runs the Gerrit Verification of UI CRs made against the team branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false, //this should stay on silent until we migrate
          gerritTriggerBranchPattern: gerritTriggerTeamBranchPattern,
          repos: [
            [
              repo: "cpp.ui.external.services",
              name: "ui_external_services",
            ],
            [
              repo: "cpp.ui.admin",
              name: "ui.admin",
            ],
            [
              repo: "cpp.ui.c2i",
              name: "ui.c2i",
            ],
            [
              repo: "cpp.ui.cps.mcc",
              name: "ui_cps_mcc",
            ],
            [
              repo: "cpp.ui.defence",
              name: "ui.defence",
            ],
            [
              repo: "cpp.ui.hearing",
              name: "ui.hearing",
            ],
            [
              repo: "cpp.ui.home",
              name: "ui.home",
            ],
            [
              repo: "cpp.ui.listing",
              name: "ui.listing",
            ],
            [
              repo: "cpp.ui.prosecution.casefile",
              name: "ui.prosecution.casefile",
            ],
            [
              repo: "cpp.ui.results",
              name: "ui.results",
            ],
            [
              name: "ui_sjp",
              repo: "cpp.ui.sjp",
            ],
            [
              repo: "ui.app",
              name: "ui app",
            ],
            [
              repo: "cpp.ui.opami",
              name: "ui.opami",
            ],
            [
              name: "onlineplea",
              repo: "cpp.ui.online-plea",
            ],
            [
              name: "ui_prosecutor",
              repo: "cpp.ui.prosecutor",
            ],
            [
              repo: "cpp.ui.bulkscan",
              name: "ui.bulkscan",
            ],
            [
              repo: "cpp.ui.managepermissions",
              name: "ui.managepermissions",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "verify_team",
        ],
        [
          pipelineJob: "strategic-platform/mgmt_layer_patching.groovy",
          pipelineName: "Azure Management Layer Patching",
          description: "Runs errata patching against SP or old azure mgmt layer",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          azure_subs: [ 'SP_mgmt_layer', 'old_azure_new_mgmt_layer', 'old_azure_old_mgmt_layer' ],
          job_env: "NonLive",
          view: "DevOps_Jobs",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "idam_jobs/rota_idam_deploy.groovy",
          pipelineJobPrefix: "rota-idam-deploy-nonlive",
          pipelineName: "Rota Idam",
          description: "Runs Site/Deploy for Rota NonLive Environments",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          idam_env: [ 'sit', 'nft' ],
          view: "IDAM",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "idam_jobs/idam_patching.groovy",
          pipelineName: "Idam NonLive Patching",
          description: "Runs errata patching against specified idam environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          azure_subs: [ 'dev', 'nft' ],
          job_env: "NonLive",
          view: "IDAM",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "olp_jobs/olp_patching.groovy",
          pipelineName: "Online Plea NonLive Patching",
          description: "Runs errata patching against specified OLP environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          azure_subs: [ 'dev', 'sit', 'nft' ],
          job_env: "NonLive",
          view: "OLP",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "strategic-platform/ansible_patching.groovy",
          pipelineName: "Patching Environment",
          description: "This job is deprecated - patching will be applied as part of site - runs errata patching against a named stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "strategic-platform/masterBuildTerraform.groovy",
          pipelineName: "Terraform Build",
          description: "This job provisions the terraform instances for the given environment and terraform set of resources (core, ccm or dmz)",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          environment: [
            [
              name: "DMO",
              view: "dmo_environment"
            ],
            [
              name: "DEV",
              view: "dev_environment"
            ],
            [
              name: "SIT",
              view: "sit_environment"
            ],
            [
              name: "NFT",
              view: "nft_environment"
            ]
          ],
          tfdir: [ '---', 'core', 'ccm', 'dmz'],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ccm_tests.groovy",
          pipelineName: "Environment API Tests",
          description: "Runs the API Tests on a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment",
              parameterizedCron: [
                "00 07 * * 1-5 % JENKINS_ANSIBLE_ENVIRONMENT=steccm06;AUTOMATION_ANSIBLE_VERSION=master;JENKINS_TEST_NAME='api-test-atcm';slackNotifications='#atcm-build'",
              ]
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
               view: "nft_environment"
            ],
            [
              name: "DMO",
              stacks: dmo_environments,
               view: "dmo_environment"
            ]
          ],
          testSuite: [ '---', 'api-test', 'api-test-sc', 'api-test-c2i', 'api-test-atcm', 'api-test-cce2e', 'api-test-opami', 'api-test-stagingdarts-nft', 'api-test-scus', 'api-test-scsl', 'api-libra-connection' ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_e2e_tests.groovy",
          pipelineName: "Environment E2E Tests",
          description: "Runs E2E Tests on a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/setup_environment.groovy",
          pipelineName: "Setup Environment",
          description: "Sets up the sandbox environment data for a given stack",
          repos: [
            [
              repo: "cpp.test.data",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/static_data_patch.groovy",
          pipelineName: "Static Data Patch",
          description: "Runs the static data patches against a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ],
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ]
          ],
          patchSuite: patchSuite_mdv,
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/business_data_fixes.groovy",
          pipelineName: "Business Data Fix",
          description: "Runs the business data fixes against a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/dlq_report.groovy",
          pipelineName: "dlq report",
          description: "Generates a DLQ Report for a given Stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/run_sql_script.groovy",
          pipelineName: "Run Sql Script",
          description: "Runs a SQL script located in ansible against the postgresql context database",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "ccm-jobs/create_and_provision_test_users.groovy",
          pipelineName: "Create and Provision Test Users",
          description: "Creates and provisions test users for a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/event_transformation_tool.groovy",
          pipelineName: "Event Transformation Tool",
          description: "Runs Event Transformation tool against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ],
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/event_anonymise_tool.groovy",
          pipelineName: "Event Anonymise Tool",
          description: "Runs Event Anonymise tool against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/clone_db_anonymise_tool.groovy",
          pipelineName: "Clone SIT Database To Anonymise Server",
          description: "Clones SIT context database over to anonymisation server",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/framework_jmx_command_client.groovy",
          pipelineName: "Framework JMX Command Client",
          description: "Runs framework-jmx-command-client against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ],
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/jmx_indexer_catchup.groovy",
          pipelineName: "Framework JMX Operation Indexer Catchup",
          description: "Runs Indexer Catchup against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/jmx_rebuild_and_catchup.groovy",
          pipelineName: "Framework JMX Operation Rebuild and Catchup",
          description: "Runs Rebuild and Catchup against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/mi_replay_tool.groovy",
          pipelineName: "Mi Replay Tool",
          description: "Runs MI Replay tool against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          contextMiDataType: [
            'mireportdata',
            'misystemdata'
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/recreate_viewstore.groovy",
          pipelineName: "Recreate Viewstore",
          description: "Recreates a viewstore for a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/perf_tests.groovy",
          pipelineName: "Perf Tests",
          description: "Runs the performance tests against a NFT or SIT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/online_plea_perf_tests.groovy",
          pipelineName: "Online Plea Perf Tests",
          description: "Runs the online plea performance tests against NFT or DEV stacks",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/nft_parallel_perf_tests.groovy",
          pipelineName: "Parallel Performance Tests v2 (BETA)",
          description: "Runs parallel performance tests against NFT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ste_perf_tests.groovy",
          pipelineName: "Performance Tests",
          description: "Runs the performance tests against STE stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ste_parallel_perf_test.groovy",
          pipelineName: "STE Parallel Performance Tests",
          description: "Runs parallel performance tests against STE stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/parallel_perf_tests.groovy",
          pipelineName: "Parallel Perf Tests",
          description: "Runs parallel performance tests against a NFT or SIT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/perf_test_verifier.groovy",
          pipelineName: "Perf Test Verifier",
          description: "Runs the performance tests verifier against a NFT or SIT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ccm_create_cases.groovy",
          pipelineName: "Create cases in Criminal Courts",
          description: "Use case creation library to create TVL and TFL cases in Criminal Courts",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ccm_e2e_testsV1.groovy",
          pipelineName: "Old UI_APP Business Assurance E2E Tests",
          description: "Runs the legacy business assurance tests against a stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment",
              parameterizedCron: [
                  "30 07 * * 1-5 % JENKINS_ANSIBLE_ENVIRONMENT=steccm06;JENKINS_PIPELINE_ID='dev/1065';AUTOMATION_ANSIBLE_VERSION=master;JENKINS_TEST_NAME='atcm-e2e';slackNotifications='#atcm-build'",
              ]
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          testSuite: [ 'c2i-e2e', 'atcm-e2e', 'r2-e2e', 'opami-e2e','r2-e2e-scenarios','r2-e2e-scenarios-i2t','r2-e2e-scenarios-ccr', 'e2e-bat', 'scenarios-e2e', 'all-e2e' ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_e2e_dat_testsV2.groovy",
          pipelineName: "Developer Assurance Tests E2E - V2",
          description: "Runs the developer assurance tests against a stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ]
          ],
          testSuite: [ 'cpp.ui.c2i', 'cpp.ui.defence', 'cpp.ui.hearing', 'cpp.ui.opami', 'cpp.ui.prosecutor', 'cpp.ui.sjp', 'cpp.ui.bulkscan' ],
          testProfileSuite: [ 'e2e-dat', 'all-e2e', 'atcm-e2e', 'c2i-e2e', 'opami-e2e', 'r2-e2e' ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "strategic-platform/ansible_update_oms_nlv.groovy",
          pipelineName: "Update OMS agent",
          description: "Attempts to fix up OMS agents when the extension has been successfully installed on a VM",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "temporary_jobs",
        ],
        [
          pipelineJob: "strategic-platform/ansible_create_datetag_pulp.groovy",
          pipelineName: "Create New Pulp Tag",
          description: "Creates a new Pulp Tag for patching (automatically runs on a sunday night) with a stamp of the current date (therefore beware of manually running more than once a day)",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: 'H 9 * * 0',
          view: "strategic_platform",
        ],
        [
          pipelineJob: "strategic-platform/ansible_gerrit_backup.groovy",
          pipelineName: "Backup Gerrit Master",
          description: "Run azcopy daily at 3am to copy the gerrit data directory to a timsetamped blob",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '0 3 * * *',
          view: "strategic_platform",
        ],
        [
          pipelineJob: "strategic-platform/ansible_gerrit_backup2.groovy",
          pipelineName: "Backup Gerrit Test Master",
          description: "Run azcopy daily at 2am to copy the gerrit data directory to a timsetamped blob",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '0 2 * * *',
          view: "strategic_platform",
        ],
        [
          pipelineJob: "ccm-jobs/library_pipeline.groovy",
          pipelineName: "Platform Library",
          description: "[WIP] Pipeline for platform library verify/validations",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetCreation: true,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: gerritTriggerTeamAndMasterPattern,
          repos: [
            [
              name: "maven_parent_pom",
              repo: "cpp.platform.maven.parent-pom",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "maven_service_parent_pom",
              repo: "cpp.platform.maven.service-parent-pom",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "maven_library_parent_pom",
              repo: "cpp.platform.maven.library-parent-pom",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "maven_common_bom",
              repo: "cpp.platform.maven.common-bom",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "maven_service_common_resources",
              repo: "cpp.platform.maven.service-common-resources",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "maven_frontend_parent",
              repo: "cpp.platform.maven.frontend-parent",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_activiti_liquibase",
              repo: "cpp.activiti.liquibase",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_camunda_liquibase",
              repo: "cpp.camunda.liquibase",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_core_domain",
              repo: "cpp.platform.core.domain",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_library_libra_anon",
              repo: "cpp.platform.library.libra.anon",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_library_docmosis",
              repo: "cpp.platform.library.docmosis",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_priming",
              repo: "cpp.platform.priming",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_test_utils",
              repo: "cpp.platform.test-utils",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ],
            [
              name: "cpp_platform_libraries",
              repo: "cpp.platform.libraries",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_library",
        ],
        [
          pipelineJob: "ccm-jobs/platform_pipeline.groovy",
          pipelineName: "Platform Framework",
          description: "[WIP] Pipeline for platform framework verify/validations",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetCreation: true,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: 'plain:master',
          repos: [
            [
              name: "cpp_platform_tools_business-data_fixes",
              repo: "cpp.platform.tools.business-data-fixes",
              type: "framework",
            ],
            [
              name: "documentation",
              repo: "cpp-documentation",
              type: "framework",
            ],
            [
              name: "idam_simulator",
              repo: "cpp.idam.simulator",
              type: "framework",
            ],
            [
              name: "libra_simulator",
              repo: "cpp.libra.simulator",
              type: "framework",
            ],
            [
              name: "static_data_patches",
              repo: "cpp.static-data.patches",
              type: "framework",
            ],
            [
              name: "cpp_platform_simulators",
              repo: "cpp.platform.simulators",
              type: "framework",
            ],
            [
              name: "maven_library_parent_pom",
              repo: "cpp.platform.maven.library-parent-pom",
              type: "framework",
            ],
            [
              name: "maven_service_parent_pom",
              repo: "cpp.platform.maven.service-parent-pom",
              type: "framework",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_framework",
        ],
        [
          pipelineJob: "ccm-jobs/ui_validation_pipeline.groovy",
          pipelineName: "Master Branch UI Release Pipeline",
          description: "[WIP] Releases a version of the UI when CRs are merged against the master branch",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: 'plain:master',
          repos: [
            [
              name: "ui_external_services",
              repo: "cpp.ui.external.services",
            ],
            [
              name: "uiapp",
              repo: "ui.app",
            ],
            [
              name: "ui_cps_mcc",
              repo: "cpp.ui.cps.mcc",
            ],
            [
              name: "ui_listing",
              repo: "cpp.ui.listing",
            ],
            [
              name: "ui_defence",
              repo: "cpp.ui.defence",
            ],
            [
              name: "ui_hearing",
              repo: "cpp.ui.hearing",
            ],
            [
              name: "ui_onlineplea",
              repo: "cpp.ui.online-plea",
            ],
            [
              name: "ui_results",
              repo: "cpp.ui.results",
            ],
            [
              name: "ui_prosecutioncasefile",
              repo: "cpp.ui.prosecution.casefile",
            ],
            [
              name: "ui_opami",
              repo: "cpp.ui.opami",
            ],
            [
              name: "ui_sjp",
              repo: "cpp.ui.sjp",
            ],
            [
              name: "ui_home",
              repo: "cpp.ui.home",
            ],
            [
              name: "ui_prosecutor",
              repo: "cpp.ui.prosecutor",
            ],
            [
              repo: "cpp.ui.bulkscan",
              name: "ui.bulkscan",
            ],
            [
              repo: "cpp.ui.managepermissions",
              name: "ui.managepermissions",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_ui",
        ],
        [
          pipelineJob: "ccm-jobs/ui_validation_pipeline.groovy",
          pipelineName: "TEAMNAME - UI Release Pipeline",
          description: "[WIP] Releases a version of the UI when CRs are merged against the team/TEAMNAME branch",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: "plain:team/TEAMNAME",
          repos: [
            [
              name: "ui_external_services",
              repo: "cpp.ui.external.services",
            ],
            [
              name: "uiapp",
              repo: "ui.app",
            ],
            [
              name: "ui_listing",
              repo: "cpp.ui.listing",
            ],
            [
              name: "ui_defence",
              repo: "cpp.ui.defence",
            ],
            [
              name: "ui_c2i",
              repo: "cpp.ui.c2i",
            ],
            [
              name: "ui_cps_mcc",
              repo: "cpp.ui.cps.mcc",
            ],
            [
              name: "ui_hearing",
              repo: "cpp.ui.hearing",
            ],
            [
              name: "ui_onlineplea",
              repo: "cpp.ui.online-plea",
            ],
            [
              name: "ui_results",
              repo: "cpp.ui.results",
            ],
            [
              name: "ui_prosecutioncasefile",
              repo: "cpp.ui.prosecution.casefile",
            ],
            [
              name: "ui_prosecutor",
              repo: "cpp.ui.prosecutor",
            ],
            [
              name: "ui.opami",
              repo: "cpp.ui.opami",
            ],
            [
              name: "ui_home",
              repo: "cpp.ui.home",
            ],
            [
              name: "ui_sjp",
              repo: "cpp.ui.sjp",
            ],
            [
              repo: "cpp.ui.bulkscan",
              name: "ui.bulkscan",
            ],
            [
              repo: "cpp.ui.managepermissions",
              name: "ui.managepermissions",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Team_TEAMNAME",
        ],
        [
          pipelineJob: "ccm-jobs/library_pipeline.groovy",
          pipelineName: "TEAMNAME - Platform Library",
          description: "[WIP] Pipeline for team library verify/validations",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetCreation: true,
          gerritOnPatchsetMerged: true,
          gerritTriggerBranchPattern: "plain:team/TEAMNAME",
          repos: [
            [
              name: "cpp_platform_libraries",
              repo: "cpp.platform.libraries",
              type: "library",
              libraryPipelineMavenCustomGoals: "",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Team_TEAMNAME",
        ],
        [
          pipelineJob: "ccm-jobs/platform_external_release.groovy",
          pipelineName: "platform external release",
          description: "[WIP] Release mechanism for Performance Verifier and Fileservice projects to artifactory",
          gerritTriggerEnable: true,
          gerritTriggerSilent: true, //this should stay on silent until we migrate
          gerritTriggerBranchPattern: 'plain:master',
          repos: [
            [
              name: "fileservice",
              product: "fileservice_project_version",
              parent_artifact_id: "file-service",
              artifact_id: "file-service-liquibase",
              group_id: "uk.gov.justice.services",
              packaging: "jar",
              repo: "bintray-cjscommonplatform",
            ],
            [
              name: "performanceverifier",
              product: "cpp_performance_verifier_tool_version",
              parent_artifact_id: "performance-test-utils",
              artifact_id: "performance-verifier",
              group_id: "uk.gov.justice.performance",
              packaging: "jar",
              repo: "bintray-cjscommonplatform",
             ]
          ],
          slackNotifications: "sp-notifications",
          view: "Ext_Release",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_adhoc.groovy",
          pipelineName: "Adhoc",
          description: "Allows running an Adhoc Ansible Playbook against a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_pgbase_backup.groovy",
          pipelineName: "Alfresco & Context PGBase Backup",
          description: "PGBase Backs up the alfresco and context databases in order. This will eventually be implemented as a cron job on most environments.",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              parameterizedCron: [
                '00 08 * * * % JENKINS_ANSIBLE_ENVIRONMENT=devccm08;AUTOMATION_ANSIBLE_VERSION=dev/AUDIT-live-2031',
              ],
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_aem_backup.groovy",
          pipelineName: "AEM Backup",
          description: "Backs up AEM",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "atl-jobs/atl_terraform.groovy",
          pipelineJobPrefix: "atl-terraform-build-nle",
          pipelineName: "ATL Terraform",
          description: "This job provisions the terraform for ATL NLE",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'atl' ],
          slackNotifications: "sp-notifications",
          view: "atl_environment"
        ],
        [
          pipelineJob: "atl-jobs/atl_site.groovy",
          pipelineJobPrefix: "atl-site-nle",
          pipelineName: "ATL Site",
          description: "This job runs ansible sitefor ATL NLE",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "atl_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_terraform.groovy",
          pipelineJobPrefix: "rota-terraform-build-dev",
          pipelineName: "Rota Terraform",
          description: "This job provisions the terraform for Rota DEV",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'rota' ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_terraform.groovy",
          pipelineJobPrefix: "rota-terraform-build-sit",
          pipelineName: "Rota Terraform",
          description: "This job provisions the terraform for Rota SIT",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'rota' ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_terraform.groovy",
          pipelineJobPrefix: "rota-terraform-build-nft",
          pipelineName: "Rota Terraform",
          description: "This job provisions the terraform for Rota NFT",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'rota' ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_idam_deploy.groovy",
          pipelineJobPrefix: "rota-idam-deploy-sit",
          pipelineName: "Rota Idam",
          description: "Runs Site/Deploy for Rota SIT IDAM",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              stacks: [
                '---',
                'sitrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_idam_deploy.groovy",
          pipelineJobPrefix: "rota-Idam-deploy-nft",
          pipelineName: "Rota Idam",
          description: "Runs Site/Deploy for Rota NFT IDAM",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              stacks: [
                '---',
                'nftrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_common.groovy",
          pipelineName: "Rota Common",
          description: "Runs Site against the Rota Management layer for a given environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          rota_environments: [
            'dev',
            'sit',
            'nft'
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_build.groovy",
          pipelineName: "Rota Build",
          description: "Builds the Rota Java Applications and publishes to artifactory",
          repos: [
            [
              repo: "cpp.rota.new",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_performance_tests.groovy",
          pipelineName: "Rota Performance Tests",
          description: "Run ROTA performance tests against NFT",
          repos: [
            [
              repo: "cpp.rota.performance-tests",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_automation_tests.groovy",
          pipelineName: "Rota Automation Tests",
          description: "Runs automation tests on selected non-live environment",
          repos: [
            [
              repo: "cpp.rota.automation-tests",
            ]
          ],
          rota_environments: [
            '---',
            'sit',
            'nft'
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_automation_api_tests.groovy",
          pipelineJobPrefix: "rota-automation-api-tests-nlv-rot",
          pipelineName: "Rota Automation API Tests",
          description: "Runs automation API tests on selected non-live environment",
          repos: [
            [
              repo: "cpp.rota.automation-tests",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sitrot01',
                'nftrot01'
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_restart_services.groovy",
          pipelineJobPrefix: "rota-restart-services-nlv-rot",
          pipelineName: "Rota Restart Services",
          description: "Restarts Services for selected non-live environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sterot01',
                'sterot02',
                'sitrot01',
                'nftrot01'
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start_vms.groovy",
          pipelineJobPrefix: "rota-start-vms-nlv-rot",
          pipelineName: "Rota Start VMs",
          description: "Starts VMs for selected non-live environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sterot01',
                'sterot02',
                'sitrot01',
                'nftrot01'
              ],
              parameterizedCron: [
                '# 00 07 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=nft;JENKINS_ANSIBLE_ENVIRONMENT=nftrot01;JENKINS_ANSIBLE_LIMIT=!*ROT01AOP*:!*ROT01DOP*',
                '# 00 07 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=sit;JENKINS_ANSIBLE_ENVIRONMENT=sitrot01',
                '# 00 05 * * * %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=devrot01;JENKINS_ANSIBLE_LIMIT=!*ROT01AOP*:!*ROT01DOP*',
                '# 03 07 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=sterot01;JENKINS_ANSIBLE_LIMIT=!*ACTAP01*:!*AMSBK01*:!*ARDCS01*:!*ADOCM01*:!*DCTDB01*',
                '# 14 07 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=sterot02;JENKINS_ANSIBLE_LIMIT=!*ACTAP01*:!*AMSBK01*:!*ARDCS01*:!*ADOCM01*:!*DCTDB01*',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop_vms.groovy",
          pipelineJobPrefix: "rota-stop-vms-nlv-rot",
          pipelineName: "Rota Stop VMs",
          description: "Stops VMs for selected non-live environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sterot01',
                'sterot02',
                'sitrot01',
                'nftrot01'
              ],
              parameterizedCron: [
                '# 00 19 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=nft;JENKINS_ANSIBLE_ENVIRONMENT=nftrot01;JENKINS_ANSIBLE_LIMIT=!*ROT01AOP*:!*ROT01DOP*',
                '# 00 19 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=sit;JENKINS_ANSIBLE_ENVIRONMENT=sitrot01',
                '# 00 23 * * * %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=devrot01;JENKINS_ANSIBLE_LIMIT=!*ROT01AOP*:!*ROT01DOP*',
                '# 03 19 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=sterot01;JENKINS_ANSIBLE_LIMIT=!*ACTAP01*:!*AMSBK01*:!*ARDCS01*:!*ADOCM01*:!*DCTDB01*',
                '# 06 19 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=dev;JENKINS_ANSIBLE_ENVIRONMENT=sterot02;JENKINS_ANSIBLE_LIMIT=!*ACTAP01*:!*AMSBK01*:!*ARDCS01*:!*ADOCM01*:!*DCTDB01*',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start_stop_optimisations.groovy",
          pipelineJobPrefix: "rota-start-stop-optimisations-nlv-rot",
          pipelineName: "Rota Optimisations Start/Stop",
          description: "Start and stop optimisations for selected non-live environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sitrot01',
                'nftrot01'
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_adhoc.groovy",
          pipelineJobPrefix: "rota-adhoc-nlv",
          pipelineName: "Rota Adhoc",
          description: "Allows running an Adhoc Ansible Playbook against a rota stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_build_deploy.groovy",
          pipelineName: "Rota Build-Deploy",
          description: "Runs Build & Deploy for Rota ENVs",
          repos: [
            [
              repo: "automation.ansible",
              repoRota: "cpp.rota.new",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NLV-ROT",
              stacks: [
                '---',
                'devrot01',
                'sterot01',
                'sterot02',
                'sitrot01',
                'nftrot01'
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy.groovy",
          pipelineJobPrefix: "rota-site-deploy-dev",
          pipelineName: "Rota Deploy",
          description: "Runs Site/Deploy for Rota DEV",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'devrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy_ste.groovy",
          pipelineJobPrefix: "rota-site-deploy-dev-2-3",
          pipelineName: "2 & 3 Rota Deploy",
          description: "Runs Site/Deploy for Rota DEV 2 and DEV 3",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'sterot01',
                'sterot02',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_set_ste_tags.groovy",
          pipelineJobPrefix: "rota-set-tags",
          pipelineName: "Rota Set STE Tags",
          description: "Set Rota Tags For STE29 and STE31",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "STE",
              stacks: [
                'sterot01',
                'sterot02',
              ],
              parameterizedCron: [
                '30 18 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=ste;JENKINS_ANSIBLE_ENVIRONMENT=sterot01',
                '45 18 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=ste;JENKINS_ANSIBLE_ENVIRONMENT=sterot02',
                '30 06 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=ste;JENKINS_ANSIBLE_ENVIRONMENT=sterot01',
                '45 06 * * 1-5 %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT=ste;JENKINS_ANSIBLE_ENVIRONMENT=sterot02',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy.groovy",
          pipelineJobPrefix: "rota-site-deploy-sit",
          pipelineName: "Rota Deploy",
          description: "Runs Site/Deploy for Rota SIT",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              stacks: [
                '---',
                'sitrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy.groovy",
          pipelineJobPrefix: "rota-site-deploy-nft",
          pipelineName: "Rota Deploy",
          description: "Runs Site/Deploy for Rota NFT",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              stacks: [
                '---',
                'nftrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start_ste.groovy",
          pipelineJobPrefix: "rota-start-dev-2-3",
          pipelineName: "2 & 3 Rota Start",
          description: "Starts the services for a Rota DEV2 and DEV3 stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'sterot01',
                'sterot02',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start.groovy",
          pipelineJobPrefix: "rota-start-dev",
          pipelineName: "Rota Start",
          description: "Starts the services for a Rota DEV stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'devrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start.groovy",
          pipelineJobPrefix: "rota_start-sit",
          pipelineName: "Rota Start",
          description: "Starts the services for a Rota SIT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              stacks: [
                '---',
                'sitrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start.groovy",
          pipelineJobPrefix: "rota_start-nft",
          pipelineName: "Rota Start",
          description: "Starts the services for a Rota NFT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              stacks: [
                '---',
                'nftrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop_ste.groovy",
          pipelineJobPrefix: "rota-stop-dev-2-3",
          pipelineName: "2 & 3 Rota Stop",
          description: "Stops the services for a Rota DEV2 and DEV3  stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'sterot01',
                'sterot02',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop.groovy",
          pipelineJobPrefix: "rota-stop-dev",
          pipelineName: "Rota Stop",
          description: "Stops the services for a Rota DEV stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'devrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_update_workers.groovy",
          pipelineJobPrefix: "rota-update-workers-dev",
          pipelineName: "Rota Update Workers",
          description: "Updates the workers for a Rota DEV stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'devrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop.groovy",
          pipelineJobPrefix: "rota_stop-sit",
          pipelineName: "Rota Stop",
          description: "Stops the services for a Rota SIT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              stacks: [
                '---',
                'sitrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop.groovy",
          pipelineJobPrefix: "rota_stop-nft",
          pipelineName: "Rota Stop",
          description: "Stops the services for a Rota NFT stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              stacks: [
                '---',
                'nftrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_patching.groovy",
          pipelineJobPrefix: "rota-patching-dev",
          pipelineName: "Rota Patching",
          description: "Runs the errata patching job against Rota Dev",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'devrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_patching_ste.groovy",
          pipelineJobPrefix: "rota-patching-dev-2-3",
          pipelineName: "2 & 3 Rota Patching",
          description: "Runs the errata patching job against Rota Dev 2 and Dev 3",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEV",
              stacks: [
                '---',
                'sterot01',
                'sterot02',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_patching.groovy",
          pipelineJobPrefix: "rota-patching-sit",
          pipelineName: "Rota Patching",
          description: "Runs the errata patching job against Rota SIT",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "SIT",
              stacks: [
                '---',
                'sitrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_patching.groovy",
          pipelineJobPrefix: "rota-patching-nft",
          pipelineName: "Rota Patching",
          description: "Runs the errata patching job against Rota NFT",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "NFT",
              stacks: [
                '---',
                'nftrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "strategic-platform/ansible_manage_users.groovy",
          pipelineName: "Ansible - Manage Users",
          description: "Creates and Removes VPN and Jumpbox accounts for users as per ansible definitions",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "ccm-jobs/mi_report_archive.groovy",
          pipelineName: "MI Report Archive",
          description: "Creates an archived MI report for a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
             [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "strategic-platform/promote_artifact.groovy",
          pipelineName: "Promote Artifacts",
          description: "[WIP] Promotes artifacts from NLV Artifactory to LV artifactory (currently promotes artifacts from the NLV artifactory to NLV test artifactory)",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/environmentStartupInspecTrigger.groovy",
          pipelineName: "Inspec Test Trigged On Automatic Startup",
          description: "This project is a downstream job for the custom environment startup-shutdown job.\n This job will house the Inspec jobs kicked off by the job.",
          repos: [
            [
              repo: "automation.azure.shutdown",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/renew_certs.groovy",
          pipelineName: "Renew certs",
          description: "Renews the certificates for a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "DMO",
              stacks: dmo_environments,
              view: "dmo_environment"
            ],
            [
              name: "STE",
              stacks: ste_environments,
              view: "standard_test_environment"
            ],
            [
              name: "DEV",
              stacks: dev_environments,
              view: "dev_environment"
            ],
            [
              name: "SIT",
              stacks: sit_environments,
              view: "sit_environment"
            ],
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "ea-certs-alerts",
        ],
        [
          pipelineJob: "strategic-platform/teamsNotifications.groovy",
          pipelineName: "Teams Notifications",
          description: "This job is used for sending automated notifications to Teams",
            repos: [
              [
                repo: "automation.jenkins-dsl-jobs",
              ]
            ],
            cronTriggerEnable: true,
            cronTrigger: '25 10 * * 1-5',
            view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/run_custom_auto_startup_shutdown.groovy",
          pipelineName: "Custom Environment Startup-Shutdown",
          description: "This project gives the option to Development team to change Auto-Shutdown stacks.\nAll the stacks that are checked will be Shut-down at the scheduled time.",
            repos: [
              [
                repo: "automation.ansible",
              ]
            ],
            parameterizedCron: [
              '5 1-2,4-23 * * * %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT_STE=true;ENVIRONMENT_DEV=true;ENVIRONMENT_DMO=false;ENVIRONMENT_SIT=false;ENVIRONMENT_NFT=false',
              '52 22,23 * * * %AUTOMATION_ANSIBLE_VERSION=master;ENVIRONMENT_STE=true;ENVIRONMENT_DEV=true;ENVIRONMENT_DMO=false;ENVIRONMENT_SIT=false;ENVIRONMENT_NFT=false',
            ],
            slackNotifications: "NOT IN USE",
            view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/check_jenkins_nodes.groovy",
          pipelineName: "Check state of Jenkins nodes",
          description: "Job to check the status of the Jenkins swarm to see if all of the nodes are connected.",
          repos:[
            [
              repo: "automation.jenkins-dsl-jobs"
            ]
          ],
          cronTriggerEnable: true,
          cronTrigger: '0,30 * * * *',
          view: "strategic_platform"
        ],
        [
          pipelineJob: "ccm-jobs/team_api_e2e_test_pipelines/team_api_e2e_test.groovy",
          pipelineName: "Team Branch - API and E2E Tests",
          description: "Runs deploy then E2E/API tests for a team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "ENV_TEAM",
              stacks: "ENV_TEAM_environments",
              view: "Team_ENV_TEAM",
            ],
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/team_api_e2e_test_pipelines/team_e2e_test.groovy",
          pipelineName: "Team Branch - E2E Tests v2 (BETA)",
          description: "Runs deploy then E2E tests for a team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "ENV_TEAM",
              stacks: "ENV_TEAM_environments",
              view: "Team_ENV_TEAM",
            ],
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/team_ansible_site_deploy.groovy",
          pipelineJobPrefix: "CC_ansible-deploy-dmo",
          pipelineName: "Ansible Deploy",
          description: "Runs deploy of demo cc team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEMO CC",
              stacks: cc_dmo_environments,
              view: "dmo_environment_Team"
            ]
          ]
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/team_ansible_site_deploy.groovy",
          pipelineJobPrefix: "ATCM_ansible-deploy-dmo",
          pipelineName: "Ansible Deploy",
          description: "Runs deploy of demo atcm team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEMO ATCM",
              stacks: atcm_dmo_environments,
              view: "dmo_environment_Team"
            ]
          ]
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/team_ansible_site_deploy.groovy",
          pipelineJobPrefix: "OPAMI_ansible-deploy-dmo",
          pipelineName: "Ansible Deploy",
          description: "Runs deploy of demo opami team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEMO OPAMI",
              stacks: opami_dmo_environments,
              view: "dmo_environment_Team"
            ]
          ]
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/team_deploy_ui.groovy",
          pipelineName: "Ansible Deploy UI only",
          description: "Runs deploy of the UI only for a team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "ENV_TEAM",
              stacks: "When using ENV_NAME, this will get replaced irrespective of its value",
              view: "Team_ENV_TEAM",
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/team_deploy_ui.groovy",
          pipelineJobPrefix: "CC_ansible-deploy-ui-dmo",
          pipelineName: "Ansible Deploy UI only",
          description: "Runs deploy UI of demo cc team branch to a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "DEMO CC",
              stacks: cc_dmo_environments,
              view: "dmo_environment_Team"
            ]
          ]
        ],
        [
          pipelineJob: "ccm-jobs/team_generic_pipelines/pipeline_id_operations.groovy",
          pipelineName: "git operations for Pipeline version registries",
          description: "Allows git operations (create/delete) on a given team/master pipeline repository",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
        ],
        [
          pipelineJob: "ccm-jobs/create_cms_case.groovy",
          pipelineName: "Create CMS Case",
          description: "Creates a case in CMS for testing",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "NFT",
              stacks: nft_environments,
              view: "nft_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
        [
            pipelineJob: "ccm-jobs/trigger_confluence_rc.groovy",
            pipelineName: "Trigger for a Confluence Release Candidate Case",
            description: "Publishes a page in confluence with the pipeline versions and tests status'",
            repos: [
                [
                    repo: "automation.ansible",
                ]
            ],
            slackNotifications: "sp-notifications",
            view: "Devops_Jobs",
        ],
        [
            pipelineJob: "ccm-jobs/publish_confluence_rc.groovy",
            pipelineName: "Publish for a Confluence Release Candidate Case",
            description: "Publishes a page in confluence with the pipeline versions and tests status'",
            repos: [
                [
                    repo: "automation.ansible",
                ]
            ],
            slackNotifications: "sp-notifications",
            view: "Devops_Jobs",
        ],
        [
          pipelineJob: "strategic-platform/ansible_verify.groovy",
          pipelineName: "Automation Ansible Verify",
          description: "Runs gerrit verification against the Ansible version",
          customRepoBuild: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritOnPatchsetCreation: true,
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Devops_Jobs",
        ],
        [
          pipelineJob: "ccm-jobs/ui_library_verify.groovy",
          pipelineName: "Master Branch Verify UI Libraries Job",
          description: "Runs the Gerrit Verification of UI Library CRs made against the master branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritTriggerBranchPattern: "plain:master",
            repos: [
              [
                repo: "cpp.ui.config",
                name: "ui.config",
              ],
              [
                repo: "cpp.ui.core",
                name: "ui.core",
              ],
              [
                repo: "cpp.ui.pdk2",
                name: "ui.pdk2",
              ],
              [
                repo: "cpp.ui.priming",
                name: "ui.priming",
              ],
              [
                repo: "cpp.ui.test.utils",
                name: "ui.test.utils",
              ],
            ],
          slackNotifications: "sp-notifications",
          view: "verify_master",
        ],
        [
          pipelineJob: "ccm-jobs/ui_library_verify.groovy",
          pipelineName: "TEAMNAME Team Branch Verify UI Libraries Job",
          description: "Runs the Gerrit Verification of UI Library CRs made against the TEAMNAME Teams branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritTriggerBranchPattern: "plain:team/TEAMNAME",
          repos: [
            [
              repo: "cpp.ui.config",
              name: "ui.config",
            ],
            [
              repo: "cpp.ui.core",
              name: "ui.core",
            ],
            [
              repo: "cpp.ui.pdk2",
              name: "ui.pdk2",
            ],
            [
              repo: "cpp.ui.priming",
              name: "ui.priming",
            ],
            [
              repo: "cpp.ui.test.utils",
              name: "ui.test.utils",
            ],
          ],
          slackNotifications: "sp-notifications",
          view: "Team_TEAMNAME",
        ],
        [
          pipelineJob: "ccm-jobs/ui_e2e_verify.groovy",
          pipelineName: "Master Branch Verify UI E2E Job",
          description: "Runs the Gerrit Verification of UI E2E CRs made against the master branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritTriggerBranchPattern: "plain:master",
            repos: [
              [
                repo: "cpp.ui.e2e",
                name: "ui.e2e",
              ],
            ],
          slackNotifications: "sp-notifications",
          view: "verify_master",
        ],
        [
          pipelineJob: "ccm-jobs/ui_e2e_verify.groovy",
          pipelineName: "e2e Team Branch Verify UI Job",
          description: "Runs the Gerrit Verification of UI E2E CRs made against the e2e Teams branches",
          customRepoBuild: true,
          gerritOnPatchsetCreation: true,
          gerritTriggerEnable: true,
          gerritTriggerSilent: false,
          gerritTriggerBranchPattern: "plain:team/TEAMNAME",
            repos: [
              [
                repo: "cpp.ui.e2e",
                name: "ui.e2e",
                ],
            ],
          slackNotifications: "sp-notifications",
          view: "Team_TEAMNAME",
        ],
        [
          pipelineJob: "ccm-jobs/ui_library_release.groovy",
          pipelineName: "Release UI Library",
          description: "Releases UI Library into Artifactory",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_ui",
        ],
        [
          pipelineJob: "ccm-jobs/ui_e2e_release.groovy",
          pipelineName: "Release UI E2E",
          description: "Releases UI E2E into Artifactory",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_ui",
        ],
        [
          pipelineJob: "ccm-jobs/ui_pdk_library_release.groovy",
          pipelineName: "Release PDK UI Library",
          description: "Releases PDK UI Library into Artifactory",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "platform_ui",
        ],
        [
          pipelineJob: "ccm-jobs/management_inspec.groovy",
          pipelineName: "Management Inspec",
          description: "Runs the inspec tests against the management layer",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "ccm-jobs/mi_report_schedular.groovy",
          pipelineName: "HMCTS_MI_SL_Extract",
            repos: [
              [
                repo: "automation.ansible",
              ]
            ],
            environment: [
              [
                name: "STE",
                stacks: ste_environments,
                view: "ste_environment"
              ],
              [
                  name: "SIT",
                  stacks: sit_environments,
                  view: "sit_environment"
              ]
            ],
            slackNotifications: "sp-notifications"
        ],
        [
            pipelineJob: "ccm-jobs/hmcts_nces_mi_extract.groovy",
            pipelineName: "HMCTS_NCES_MI_Extract",
              repos: [
                [
                  repo: "automation.ansible",
                ]
              ],
              environment: [
                [
                  name: "STE",
                  stacks: ste_environments,
                  view: "ste_environment"
                ],
                [
                  name: "SIT",
                  stacks: sit_environments,
                  parameterizedCron: [
                    '0 6 * * * %AUTOMATION_ANSIBLE_VERSION=master;JENKINS_ANSIBLE_ENVIRONMENT=sitccm01;JENKINS_ANSIBLE_LIMIT=sitccm01',
                  ],
                  view: "sit_environment"
                ]
              ],
              slackNotifications: "sp-notifications"
          ]
      ]
    }
    /*
       ----------
       LIVE (mpd)
       ----------
    */
    mpd {
      pipelineViewsToAutomate = [
        [
          viewName: "Strategic Platform",
          viewRegex: "strategic_platform.*",
        ],
        [
          viewName: "Environment - PRP",
          viewRegex: "prp_environment.*",
        ],
        [
          viewName: "Environment - PRD",
          viewRegex: "prd_environment.*",
        ],
        [
          viewName: "Environment - PRX",
          viewRegex: "prx_environment.*",
        ],
        [
          viewName: "Environment - ROTA",
          viewRegex: "rota_environment.*",
        ],
        [
          viewName: "Environment - BAE",
          viewRegex: "bae_environment.*",
        ],
        [
          viewName: "DevOps Jobs",
          viewRegex: "Devops_Jobs.*",
        ],
        [
          viewName: "Environment - ATL",
          viewRegex: "atl_environment.*",
        ]
      ]
      pipelinesToAutomate = [
       [
          pipelineJob: "strategic-platform/run_terraform_plan_lv.groovy",
          pipelineName: "Terraform Plan",
          description: "Run terraform plan against all MGMT and DMZ areas)",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '00 7 * * 1-5',
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/master_build_terraform_lv.groovy",
          pipelineName: "Terraform",
          description: "Run terraform plan (and optional apply against all MGMT and DMZ areas)",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/apim_tasks_lv.groovy",
          pipelineName: "APIM Tasks",
          description: "Run APIM tasks against given env(s))",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: '0 0 * * *',
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/az_tasks_lv.groovy",
          pipelineName: "FunctionApp Log Stream Tasks",
          description: "Run Log Stream Log task against selected FunctionApp",
          repos: [
            [
              repo: "automation.ansible"
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
          gerritTriggerEnable: false,
          gerritTriggerSilent: true,
        ],
        [
          pipelineJob: "strategic-platform/master_build_ansible_lv.groovy",
          pipelineName: "Ansible - Basic",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "strategic-platform/adhoc_build_ansible.groovy",
          pipelineName: "Ansible - AdHoc",
          description: "Runs an arbitrary ansible playbook against management areas with supplied parameters",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "Devops_Jobs",
        ],
        [
          pipelineJob: "strategic-platform/ansible_manage_users.groovy",
          pipelineName: "Ansible - Manage Users",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform"
        ],
        [
          pipelineJob: "ccm-jobs/ccm_site_deploy.groovy",
          pipelineName: "Environment Site Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
// ------ To be introduced after sufficient non-live testing ------
//        [
//          pipelineJob: "ccm-jobs/ccm_site_deploy_v2.groovy",
//          pipelineName: "Environment Site Deploy v2 (BETA)",
//          repos: [
//            [
//              repo: "automation.ansible",
//            ]
//          ],
//          environment: [
//            [
//              name: "PRP",
//              stacks: [
//                  'prpccm01'
//              ],
//              view: "prp_environment"
//            ],
//            [
//              name: "PRD",
//              stacks: [
//                  'prdccm01'
//              ],
//              view: "prd_environment"
//            ]
//          ],
//          deploymentTypes: [ 'SiteDeploy', 'DeployOnly', 'None' ],
//          slackNotifications: "sp-notifications",
//        ],
        [
          pipelineJob: "bae-jobs/bae_site_deploy.groovy",
          pipelineName: "Environment Site Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "bae-jobs/setup_environment.groovy",
          pipelineName: "Setup Environment",
          description: "Sets up the sandbox environment data for a given stack",
          repos: [
            [
              repo: "cpp.test.data",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  'prpbae01'
              ],
              view: "bae_environment"
            ],
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "bae-jobs/create_and_provision_test_users.groovy",
          pipelineName: "Create and Provision Test Users",
          description: "Creates and provisions test users for a given stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  'prpbae01'
              ],
              view: "bae_environment"
            ],
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "strategic-platform/ansible_create_datetag_pulp_lv.groovy",
          pipelineName: "Create New Pulp Tag",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          cronTriggerEnable: true,
          cronTrigger: 'H 12 * * 0',
          view: "strategic_platform",
        ],
        [
          pipelineJob: "bae-jobs/bae_full_environment_shutter.groovy",
          pipelineName: "Controlled BAE Environment Shutter",
          description: "This job shutters the bae stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              view: "bae_environment",
              stacks: [
                  'prpbae01'
              ],
            ],
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "bae-jobs/bae_full_environment_start.groovy",
          pipelineName: "Controlled BAE Environment Start-up",
          description: "This job starts up the applications in order on BAE",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              view: "bae_environment",
              stacks: [
                  'prpbae01'
              ],
            ],
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "strategic-platform/ansible_update_oms_lv.groovy",
          pipelineName: "Update OMS agent",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "strategic_platform",
        ],
        [
          pipelineJob: "strategic-platform/mgmt_layer_patching.groovy",
          pipelineName: "Azure Management Layer Patching",
          description: "Runs errata patching against SP or old azure mgmt layer",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          azure_subs: [ 'SP_mgmt_layer', 'old_azure_old_mgmt_layer' ],
          job_env: "Live",
          view: "DevOps_Jobs",
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "strategic-platform/ansible_patching.groovy",
          pipelineName: "Patching Environment",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  'prpbae01'
              ],
              view: "bae_environment"
            ],
            [
              name: "PRP",
              stacks: [
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "strategic-platform/masterBuildTerraform_lv.groovy",
          pipelineName: "Terraform Build",
          repos: [
            [
              repo: "automation.terraform"
            ]
          ],
          environment: [
            [
              name: "PRP",
              view: "prp_environment"
            ],
            [
              name: "PRD",
              view: "prd_environment"
            ],
            [
              name: "BAE",
              view: "bae_environment"
            ],
            [
              name: "PRX",
              view: "prx_environment"
            ]
          ],
          tfdir: [ '---', 'core', 'ccm', 'dmz' ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/ccm_full_environment_start.groovy",
          pipelineName: "Controlled Environment Start-up",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ]
        ] ,
        [
          pipelineJob: "ccm-jobs/business_data_fixes.groovy",
          pipelineName: "Business Data Fix",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "bae-jobs/business_data_fixes.groovy",
          pipelineName: "Business Data Fix",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  '---',
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
          [
          pipelineJob: "ccm-jobs/static_data_patch.groovy",
          pipelineName: "Static Data Patch",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          patchSuite: patchSuite_mpd,
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "bae-jobs/static_data_patch.groovy",
          pipelineName: "Static Data Patch",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  '---',
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          patchSuite: patchSuite_mpd,
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "ccm-jobs/ccm_full_environment_shutter.groovy",
          pipelineName: "Controlled Environment Shutter",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ]
         ],
        [
          pipelineJob: "ccm-jobs/recreate_viewstore.groovy",
          pipelineName: "Recreate Viewstore",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "bae-jobs/recreate_viewstore.groovy",
          pipelineName: "Recreate Viewstore",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  '---',
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "ccm-jobs/event_transformation_tool.groovy",
          pipelineName: "Event Transformation Tool",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "bae-jobs/event_transformation_tool.groovy",
          pipelineName: "Event Transformation Tool",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                  '---',
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "ccm-jobs/event_anonymise_tool.groovy",
          pipelineName: "Event Anonymise Tool",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/framework_jmx_command_client.groovy",
          pipelineName: "Framework JMX Command Client",
          description: "Runs framework-jmx-command-client against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],

          environment: [
            [
              name: "PRP",
              stacks: [
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
         [
          pipelineJob: "bae-jobs/framework_jmx_command_client.groovy",
          pipelineName: "Framework JMX Command Client",
          description: "Runs framework-jmx-command-client against a supplied stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],

          environment: [
            [
              name: "BAE",
              stacks: [
                  'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
          [
          pipelineJob: "ccm-jobs/mi_replay_tool.groovy",
          pipelineName: "Mi Replay Tool",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          contextMiDataType: [
            'mireportdata',
            'misystemdata'
          ],
          ansibleVerbosity: [
            '0',
            '1',
            '2',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/mi_report_archive.groovy",
          pipelineName: "MI Report Archive",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                  '---',
                  'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                  '---',
                  'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "ccm-jobs/run_sql_script.groovy",
          pipelineName: "Run Sql Script",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                  '---',
                  'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ]
        ],
        [
          pipelineJob: "ccm-jobs/ccm_adhoc.groovy",
          pipelineName: "Adhoc",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ],
            [
              name: "PRX",
              stacks: [
                '---',
                'prxccm01'
              ],
              view: "prx_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
          [
          pipelineJob: "bae-jobs/bae_adhoc.groovy",
          pipelineName: "Adhoc",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                '---',
                'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_pgbase_backup.groovy",
          pipelineName: "Alfresco & Context PGBase Backup",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                '---',
                'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_backup.groovy",
          pipelineName: "Alfresco & Context Backup",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              parameterizedCron: [
                '00 08 * * * % JENKINS_ANSIBLE_ENVIRONMENT=prpccm01;AUTOMATION_ANSIBLE_VERSION=dev/AUDIT-live-2031',
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                '---',
                'prxccm01'
              ],
              parameterizedCron: [
                '00 08 * * * % JENKINS_ANSIBLE_ENVIRONMENT=prxccm01;AUTOMATION_ANSIBLE_VERSION=dev/AUDIT-live-2031',
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              parameterizedCron: [
                  '00 00 * * * % JENKINS_ANSIBLE_ENVIRONMENT=prdccm01;AUTOMATION_ANSIBLE_VERSION=dev/AUDIT-live-2031',
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
         [
          pipelineJob: "bae-jobs/bae_backup.groovy",
          pipelineName: "Alfresco & Context Backup",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "BAE",
              stacks: [
                '---',
                'prpbae01'
              ],
              parameterizedCron: [
                '00 08 * * * % JENKINS_ANSIBLE_ENVIRONMENT=prpccm01;AUTOMATION_ANSIBLE_VERSION=release/19.0',
              ],
              view: "bae_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
          [
          pipelineJob: "ccm-jobs/ccm_idam_deploy.groovy",
          pipelineName: "Environment IDAM Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_aem_backup.groovy",
          pipelineName: "AEM Backup",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          ansibleVerbosity: [
            '2',
            '0',
            '1',
            '3',
            '4'
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_aem_create_users.groovy",
          pipelineName: "Environment Create AEM Users",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
             [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/ccm_idam_deploy.groovy",
          pipelineName: "Environment IDAM Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
             [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                '---',
                'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
          slackNotifications: "sp-notifications",
        ],
        [
          pipelineJob: "ccm-jobs/create_cms_case.groovy",
          pipelineName: "Create CMS Case",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
          ],
          slackNotifications: "sp-notifications"
        ],
        [
          pipelineJob: "atl-jobs/atl_terraform_lv.groovy",
          pipelineJobPrefix: "atl-terraform-build-prp",
          pipelineName: "ATL Terraform",
          description: "This job provisions the terraform for ATL PRP",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'atl' ],
          slackNotifications: "sp-notifications",
          view: "atl_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_terraform_lv.groovy",
          pipelineJobPrefix: "rota-terraform-build-prp",
          pipelineName: "Rota Terraform",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'rota' ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_terraform_lv.groovy",
          pipelineJobPrefix: "rota-terraform-build-prd",
          pipelineName: "Rota Terraform",
          repos: [
            [
              repo: "automation.terraform",
            ]
          ],
          tfdir: [ 'rota' ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_idam_deploy.groovy",
          pipelineJobPrefix: "rota-Idam-deploy-prp",
          pipelineName: "Rota Idam",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_idam_deploy.groovy",
          pipelineJobPrefix: "rota-Idam-deploy-prd",
          pipelineName: "Rota Idam",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_common.groovy",
          pipelineName: "Rota Common",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          rota_environments: [
            'prp',
            'prd'
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_build.groovy",
          pipelineName: "Rota Build",
          repos: [
            [
              repo: "cpp.rota.new",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy.groovy",
          pipelineJobPrefix: "rota-site-deploy-prp",
          pipelineName: "Rota Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_deploy.groovy",
          pipelineJobPrefix: "rota-site-deploy-prd",
          pipelineName: "Rota Deploy",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_adhoc.groovy",
          pipelineJobPrefix: "rota-adhoc-prp",
          pipelineName: "Rota Adhoc",
          description: "Allows running an Adhoc Ansible Playbook against the PRP rota stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_adhoc.groovy",
          pipelineJobPrefix: "rota-adhoc-prd",
          pipelineName: "Rota Adhoc",
          description: "Allows running an Adhoc Ansible Playbook against the PRD rota stack",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          view: "rota_environment"
        ],
        [
          pipelineJob: "rota-jobs/rota_start.groovy",
          pipelineJobPrefix: "rota_start-prp",
          pipelineName: "Rota Start",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start.groovy",
          pipelineJobPrefix: "rota_start-prd",
          pipelineName: "Rota Start",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop.groovy",
          pipelineJobPrefix: "rota_stop-prp",
          pipelineName: "Rota Stop",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start_vms.groovy",
          pipelineJobPrefix: "rota_start_vms-prp",
          pipelineName: "Rota Start VMS",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop_vms.groovy",
          pipelineJobPrefix: "rota_stop_vms-prp",
          pipelineName: "Rota Stop VMS",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop.groovy",
          pipelineJobPrefix: "rota_stop-prd",
          pipelineName: "Rota Stop",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
                [
          pipelineJob: "rota-jobs/rota_patching.groovy",
          pipelineJobPrefix: "rota-patching-prp",
          pipelineName: "Rota Patching",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prprot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_patching.groovy",
          pipelineJobPrefix: "rota-patching-prd",
          pipelineName: "Rota Patching",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_start_vms.groovy",
          pipelineJobPrefix: "rota_start_vms-prd",
          pipelineName: "Rota Start VMS",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "rota-jobs/rota_stop_vms.groovy",
          pipelineJobPrefix: "rota_stop_vms-prd",
          pipelineName: "Rota Stop VMS",
          repos: [
            [
              repo: "automation.ansible",
            ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRD",
              stacks: [
                '---',
                'prdrot01',
              ],
              view: "rota_environment"
            ]
          ]
        ],
        [
          pipelineJob: "ccm-jobs/full_inspec.groovy",
          pipelineName: "Run Inspec suite",
          description: "Runs the inspec tests against a given stack to validate the environment",
          repos: [
              [
                  repo: "automation.ansible",
              ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "PRP",
              stacks: [
                '---',
                'prpccm01'
              ],
              view: "prp_environment"
            ],
            [
              name: "PRX",
              stacks: [
                '---',
                'prxccm01'
              ],
              view: "prx_environment"
            ],
            [
              name: "PRD",
              stacks: [
                '---',
                'prdccm01'
              ],
              view: "prd_environment"
            ]
          ],
        ],
        [
          pipelineJob: "bae-jobs/bae_full_inspec.groovy",
          pipelineName: "Run Inspec suite",
          description: "Runs the inspec tests against a given stack to validate the environment",
          repos: [
              [
                  repo: "automation.ansible",
              ]
          ],
          slackNotifications: "sp-notifications",
          environment: [
            [
              name: "BAE",
              stacks: [
                '---',
                'prpbae01'
              ],
              view: "bae_environment"
            ]
          ],
        ],
        [
            pipelineJob: "ccm-jobs/mi_report_schedular.groovy",
            pipelineName: "HMCTS_MI_SL_Extract",
              repos: [
                [
                  repo: "automation.ansible",
                ]
              ],
              environment: [
                [
                    name: "PRD",
                    stacks: [
                        '---',
                        'prdccm01'
                     ],
                    parameterizedCron: [
                      '15 0 * * * %AUTOMATION_ANSIBLE_VERSION=master;JENKINS_ANSIBLE_ENVIRONMENT=prdccm01;JENKINS_ANSIBLE_LIMIT=prdccm01',
                    ],
                    view: "prd_environment"
                ]
              ],
              slackNotifications: "sp-notifications"
         ],
         [
             pipelineJob: "ccm-jobs/hmcts_nces_mi_extract.groovy",
             pipelineName: "HMCTS_NCES_MI_Extract",
               repos: [
                 [
                   repo: "automation.ansible",
                 ]
               ],
               environment: [
                 [
                   name: "PRD",
                   stacks: [
                        '---',
                        'prdccm01'
                     ],
                   parameterizedCron: [
                     '0 6 * * * %AUTOMATION_ANSIBLE_VERSION=master;JENKINS_ANSIBLE_ENVIRONMENT=prdccm01;JENKINS_ANSIBLE_LIMIT=prdccm01',
                   ],
                   view: "prd_environment"
                 ]
               ],
               slackNotifications: "sp-notifications"
           ]
      ]
    }
    all {
      pipelinesToAutomate = [
      ]
    }
  }
}
