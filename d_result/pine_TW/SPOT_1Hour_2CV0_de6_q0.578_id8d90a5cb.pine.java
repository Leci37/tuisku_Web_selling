//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: SPOT_1Hour_2CV0_8d90a5cb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SPOT_1Hour_2CV0_8d90a5cb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SPOT_1Hour_8d90a5cb(mf, ad, ad_mf, VIP_VIM, VIM, VIP)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=6, max_features=0.7, min_samples_split=10,random_state=843828734)
	if( mf <= -0.001515 )
		if( ad_mf <= -6.65486 )
			if( ad <= -12945.6 )
				if( VIP <= 0.802147 )
					if( ad <= -367615 )
						if( ad <= -437342 )
							ret := -0.092308
						if( ad > -437342 )
							ret := 0.692308
					if( ad > -367615 )
						if( mf <= -0.454266 )
							ret := 0.500000
						if( mf > -0.454266 )
							ret := -0.258755
				if( VIP > 0.802147 )
					if( mf <= -0.071472 )
						if( ad_mf <= -168954 )
							ret := -0.043478
						if( ad_mf > -168954 )
							ret := 0.078481
					if( mf > -0.071472 )
						if( ad_mf <= -147545 )
							ret := 0.137324
						if( ad_mf > -147545 )
							ret := -0.167750
			if( ad > -12945.6 )
				if( VIP_VIM <= 0.317002 )
					if( ad <= -289.259 )
						if( ad <= -8668.12 )
							ret := 0.601852
						if( ad > -8668.12 )
							ret := 0.156580
					if( ad > -289.259 )
						if( VIP_VIM <= 0.056852 )
							ret := 0.698113
						if( VIP_VIM > 0.056852 )
							ret := -0.454545
				if( VIP_VIM > 0.317002 )
					if( VIP_VIM <= 0.451757 )
						if( ad_mf <= -328.613 )
							ret := -0.666667
						if( ad_mf > -328.613 )
							ret := 0.250000
					if( VIP_VIM > 0.451757 )
						if( ad_mf <= -546.923 )
							ret := 0.352941
						if( ad_mf > -546.923 )
							ret := -0.615385
		if( ad_mf > -6.65486 )
			if( VIP <= 0.663918 )
				if( mf <= -0.263463 )
					if( ad <= 3023.77 )
						if( VIP <= 0.579137 )
							ret := 0.000000
						if( VIP > 0.579137 )
							ret := -0.977778 // sell
					if( ad > 3023.77 )
						if( ad_mf <= 15269.4 )
							ret := 1.000000 // buy
						if( ad_mf > 15269.4 )
							ret := -0.833333 // sell
				if( mf > -0.263463 )
					if( ad <= 401277 )
						if( VIM <= 1.4293 )
							ret := -0.388889
						if( VIM > 1.4293 )
							ret := 0.166667
					if( ad > 401277 )
						ret := -1.000000 // sell
			if( VIP > 0.663918 )
				if( ad_mf <= 260774 )
					if( VIP_VIM <= 0.283276 )
						if( VIP_VIM <= -0.065225 )
							ret := -0.063836
						if( VIP_VIM > -0.065225 )
							ret := -0.233525
					if( VIP_VIM > 0.283276 )
						if( ad <= 229593 )
							ret := 0.108696
						if( ad > 229593 )
							ret := -0.857143 // sell
				if( ad_mf > 260774 )
					if( ad_mf <= 633853 )
						if( ad_mf <= 377526 )
							ret := -0.561151
						if( ad_mf > 377526 )
							ret := 0.103896
					if( ad_mf > 633853 )
						if( VIP <= 0.865728 )
							ret := -1.000000 // sell
						if( VIP > 0.865728 )
							ret := -0.200000
	if( mf > -0.001515 )
		if( VIP_VIM <= 0.783977 )
			if( ad_mf <= -235519 )
				if( VIP_VIM <= 0.073981 )
					if( ad_mf <= -367371 )
						if( ad <= -395327 )
							ret := -0.142857
						if( ad > -395327 )
							ret := 0.764706 // buy
					if( ad_mf > -367371 )
						if( mf <= 0.126621 )
							ret := -0.044118
						if( mf > 0.126621 )
							ret := -0.909091 // sell
				if( VIP_VIM > 0.073981 )
					if( ad <= -520449 )
						if( VIP <= 1.38985 )
							ret := -0.878788 // sell
						if( VIP > 1.38985 )
							ret := 0.000000
					if( ad > -520449 )
						if( VIP <= 1.22631 )
							ret := -0.586207
						if( VIP > 1.22631 )
							ret := -0.050000
			if( ad_mf > -235519 )
				if( ad <= -76796.3 )
					if( VIM <= 0.962638 )
						if( VIP_VIM <= 0.504861 )
							ret := 0.101911
						if( VIP_VIM > 0.504861 )
							ret := -0.234899
					if( VIM > 0.962638 )
						if( VIP_VIM <= -0.456842 )
							ret := -0.140351
						if( VIP_VIM > -0.456842 )
							ret := 0.343342
				if( ad > -76796.3 )
					if( ad_mf <= -29991.4 )
						if( ad_mf <= -30348.1 )
							ret := -0.047210
						if( ad_mf > -30348.1 )
							ret := -0.941176 // sell
					if( ad_mf > -29991.4 )
						if( ad_mf <= -28140.8 )
							ret := 0.602941
						if( ad_mf > -28140.8 )
							ret := 0.053571
		if( VIP_VIM > 0.783977 )
			if( mf <= 0.392957 )
				if( ad_mf <= 53224.3 )
					if( ad <= -26485.3 )
						if( mf <= 0.286985 )
							ret := -0.444444
						if( mf > 0.286985 )
							ret := 0.545455
					if( ad > -26485.3 )
						if( ad_mf <= -0.303803 )
							ret := -0.698795
						if( ad_mf > -0.303803 )
							ret := -0.400000
				if( ad_mf > 53224.3 )
					if( VIP <= 1.45795 )
						if( mf <= 0.342851 )
							ret := -0.944444 // sell
						if( mf > 0.342851 )
							ret := 0.000000
					if( VIP > 1.45795 )
						if( mf <= 0.27855 )
							ret := 0.692308
						if( mf > 0.27855 )
							ret := -0.347826
			if( mf > 0.392957 )
				if( mf <= 0.587362 )
					if( VIM <= 0.572883 )
						if( VIM <= 0.528184 )
							ret := 0.000000
						if( VIM > 0.528184 )
							ret := 0.714286 // buy
					if( VIM > 0.572883 )
						if( mf <= 0.538313 )
							ret := -0.120000
						if( mf > 0.538313 )
							ret := -1.000000 // sell
				if( mf > 0.587362 )
					ret := 0.857143 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Hour pine_value: 60   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1HOUR !!"
if (str.tostring(timeframe.period) != "60")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_SPOT_1Hour_8d90a5cb(mf, ad, ad_mf, VIP_VIM, VIM, VIP)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


