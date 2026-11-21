package com.example.mcpserverremote.config;

import com.example.mcpserverremote.tool.HelpDeskTools;
import java.util.List;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Commented out this config class since i am now using
 * mcptools and mcptoolsparams anotation in the tools class
 * instead of tools and toolsparam.
 */
//@Configuration
public class McpServerConfig {
//  @Bean
//  List<ToolCallback> toolCallbacks(HelpDeskTools helpDeskTools) {
//    return List.of(ToolCallbacks.from(helpDeskTools));
//  }
}
