package org.jenkins.ci.plugins;


import hudson.Extension;
import hudson.model.PageDecorator;
import net.sf.json.JSONObject;

import org.kohsuke.stapler.StaplerRequest;

// This class causes the main page load to include the custom javascript in header.jelly
@Extension
public class BuildNowListViewColumnDecorator extends PageDecorator {

}
