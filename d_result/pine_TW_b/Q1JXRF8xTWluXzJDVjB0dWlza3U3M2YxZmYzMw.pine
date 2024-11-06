//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: CRWD_1Min_2CV0_73f1ff33 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_2CV0_73f1ff33", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_73f1ff33(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( ad_mf <= 139.903 )
		if( mf <= -0.133307 )
			if( ad_mf <= 0.136371 )
				if( VIP <= 1.18553 )
					if( ad_mf <= -2570.69 )
						if( ad_mf <= -2673.18 )
							if( ad <= -337402 )
								ret := 0.772727 // buy
							if( ad > -337402 )
								ret := 0.118010
						if( ad_mf > -2673.18 )
							if( VIP_VIM <= -0.416598 )
								ret := 0.125000
							if( VIP_VIM > -0.416598 )
								ret := 0.631579
					if( ad_mf > -2570.69 )
						if( ad <= -2290.77 )
							if( VIP_VIM <= -0.694488 )
								ret := -0.600000
							if( VIP_VIM > -0.694488 )
								ret := -0.077670
						if( ad > -2290.77 )
							if( ad_mf <= -2115.68 )
								ret := 0.261905
							if( ad_mf > -2115.68 )
								ret := 0.039370
				if( VIP > 1.18553 )
					if( ad_mf <= -9934.24 )
						if( VIM <= 0.896562 )
							if( VIP <= 1.31903 )
								ret := -0.095238
							if( VIP > 1.31903 )
								ret := 0.571429
						if( VIM > 0.896562 )
							if( ad_mf <= -13142.8 )
								ret := 0.487500
							if( ad_mf > -13142.8 )
								ret := 0.891892 // buy
					if( ad_mf > -9934.24 )
						if( ad <= -9111.5 )
							ret := -1.000000 // sell
						if( ad > -9111.5 )
							if( ad <= -940.737 )
								ret := 0.104520
							if( ad > -940.737 )
								ret := 0.262605
			if( ad_mf > 0.136371 )
				if( VIP_VIM <= 0.436473 )
					if( VIP <= 3.62505 )
						if( ad_mf <= 0.167339 )
							if( VIP <= 3.10194 )
								ret := 0.461538
							if( VIP > 3.10194 )
								ret := -0.500000
						if( ad_mf > 0.167339 )
							if( ad_mf <= 129.132 )
								ret := 0.173477
							if( ad_mf > 129.132 )
								ret := 1.000000 // buy
					if( VIP > 3.62505 )
						if( VIP <= 6.27724 )
							if( VIP_VIM <= -1.99909 )
								ret := -0.428571
							if( VIP_VIM > -1.99909 )
								ret := 0.674576
						if( VIP > 6.27724 )
							if( VIM <= 6.66492 )
								ret := -0.800000 // sell
							if( VIM > 6.66492 )
								ret := 0.282744
				if( VIP_VIM > 0.436473 )
					if( VIP <= 28.984 )
						if( VIP <= 1.79099 )
							if( VIP <= 1.66492 )
								ret := -0.466667
							if( VIP > 1.66492 )
								ret := -1.000000 // sell
						if( VIP > 1.79099 )
							if( VIP <= 1.90926 )
								ret := 0.833333 // buy
							if( VIP > 1.90926 )
								ret := -0.097902
					if( VIP > 28.984 )
						if( VIM <= 37.2748 )
							ret := 0.875000 // buy
						if( VIM > 37.2748 )
							if( VIP_VIM <= 11.1295 )
								ret := 0.305556
							if( VIP_VIM > 11.1295 )
								ret := 0.875000 // buy
		if( mf > -0.133307 )
			if( VIM <= 226.523 )
				if( VIP <= 195.312 )
					if( VIM <= 0.797839 )
						if( ad_mf <= -11088.1 )
							if( mf <= 0.598513 )
								ret := -0.132075
							if( mf > 0.598513 )
								ret := 0.857143 // buy
						if( ad_mf > -11088.1 )
							if( ad <= -2880.21 )
								ret := 0.056689
							if( ad > -2880.21 )
								ret := -0.056395
					if( VIM > 0.797839 )
						if( mf <= 0.752103 )
							if( ad <= -97694.7 )
								ret := 0.561644
							if( ad > -97694.7 )
								ret := 0.075109
						if( mf > 0.752103 )
							if( VIM <= 2.98926 )
								ret := -0.125000
							if( VIM > 2.98926 )
								ret := -0.568627
				if( VIP > 195.312 )
					if( VIM <= 213.173 )
						ret := 1.000000 // buy
					if( VIM > 213.173 )
						ret := 0.571429
			if( VIM > 226.523 )
				if( VIP <= 832.569 )
					if( VIP_VIM <= 0.189947 )
						if( mf <= 0.394642 )
							if( ad_mf <= -0.327135 )
								ret := -0.285714
							if( ad_mf > -0.327135 )
								ret := -0.829545 // sell
						if( mf > 0.394642 )
							ret := -0.142857
					if( VIP_VIM > 0.189947 )
						if( mf <= 0.043975 )
							ret := -0.500000
						if( mf > 0.043975 )
							if( ad_mf <= -0.225891 )
								ret := 0.571429
							if( ad_mf > -0.225891 )
								ret := 0.777778 // buy
				if( VIP > 832.569 )
					if( VIM <= 1802.66 )
						ret := 0.583333
					if( VIM > 1802.66 )
						ret := -0.272727
	if( ad_mf > 139.903 )
		if( VIM <= 0.976954 )
			if( mf <= -0.229001 )
				if( VIM <= 0.895182 )
					if( VIP_VIM <= 0.349639 )
						if( ad <= 6824.91 )
							if( ad_mf <= 3049.1 )
								ret := 0.760000 // buy
							if( ad_mf > 3049.1 )
								ret := 0.142857
						if( ad > 6824.91 )
							ret := 1.000000 // buy
					if( VIP_VIM > 0.349639 )
						if( ad_mf <= 1256.89 )
							ret := -0.500000
						if( ad_mf > 1256.89 )
							if( VIP <= 1.25195 )
								ret := 0.363636
							if( VIP > 1.25195 )
								ret := 0.000000
				if( VIM > 0.895182 )
					if( ad_mf <= 6831.07 )
						if( ad_mf <= 4508.81 )
							if( VIM <= 0.968774 )
								ret := 0.078125
							if( VIM > 0.968774 )
								ret := 0.625000
						if( ad_mf > 4508.81 )
							ret := -0.714286 // sell
					if( ad_mf > 6831.07 )
						if( VIP_VIM <= 0.116863 )
							ret := 0.800000 // buy
						if( VIP_VIM > 0.116863 )
							ret := 0.000000
			if( mf > -0.229001 )
				if( ad_mf <= 482161 )
					if( ad <= 25719 )
						if( ad <= 12738.7 )
							if( ad <= 12707.9 )
								ret := -0.034986
							if( ad > 12707.9 )
								ret := 0.857143 // buy
						if( ad > 12738.7 )
							if( ad_mf <= 24585.2 )
								ret := -0.156951
							if( ad_mf > 24585.2 )
								ret := -0.698413
					if( ad > 25719 )
						if( ad_mf <= 29380.5 )
							if( ad_mf <= 26458.2 )
								ret := 0.676471
							if( ad_mf > 26458.2 )
								ret := 0.304348
						if( ad_mf > 29380.5 )
							if( VIM <= 0.540817 )
								ret := 0.636364
							if( VIM > 0.540817 )
								ret := -0.014908
				if( ad_mf > 482161 )
					ret := -0.923077 // sell
		if( VIM > 0.976954 )
			if( VIM <= 1.4149 )
				if( mf <= 0.00056 )
					if( VIP_VIM <= -0.220312 )
						if( ad_mf <= 131495 )
							if( ad <= 35888.1 )
								ret := -0.000708
							if( ad > 35888.1 )
								ret := -0.235632
						if( ad_mf > 131495 )
							if( ad_mf <= 230817 )
								ret := 0.875000 // buy
							if( ad_mf > 230817 )
								ret := 0.285714
					if( VIP_VIM > -0.220312 )
						if( ad <= 12515.2 )
							if( mf <= -0.046784 )
								ret := 0.090283
							if( mf > -0.046784 )
								ret := -0.011960
						if( ad > 12515.2 )
							if( ad <= 48570.5 )
								ret := 0.266112
							if( ad > 48570.5 )
								ret := -0.217949
				if( mf > 0.00056 )
					if( ad <= 1087.49 )
						if( VIP <= 1.03445 )
							if( VIP <= 1.03156 )
								ret := -0.150522
							if( VIP > 1.03156 )
								ret := -0.666667
						if( VIP > 1.03445 )
							if( VIP <= 1.14944 )
								ret := 0.071429
							if( VIP > 1.14944 )
								ret := -0.140152
					if( ad > 1087.49 )
						if( ad <= 6570.47 )
							if( VIP_VIM <= 0.048082 )
								ret := 0.007259
							if( VIP_VIM > 0.048082 )
								ret := 0.101402
						if( ad > 6570.47 )
							if( ad <= 14549.1 )
								ret := -0.133585
							if( ad > 14549.1 )
								ret := 0.019824
			if( VIM > 1.4149 )
				if( ad <= 4468.28 )
					if( ad_mf <= 293.887 )
						if( VIP_VIM <= -0.272472 )
							if( ad_mf <= 276.063 )
								ret := -0.536585
							if( ad_mf > 276.063 )
								ret := -0.866667 // sell
						if( VIP_VIM > -0.272472 )
							if( ad_mf <= 284.622 )
								ret := 0.018868
							if( ad_mf > 284.622 )
								ret := -0.857143 // sell
					if( ad_mf > 293.887 )
						if( VIM <= 8.39121 )
							if( VIP_VIM <= 0.206008 )
								ret := 0.103964
							if( VIP_VIM > 0.206008 )
								ret := -0.072438
						if( VIM > 8.39121 )
							if( ad_mf <= 587.408 )
								ret := 0.491228
							if( ad_mf > 587.408 )
								ret := 0.137500
				if( ad > 4468.28 )
					if( ad <= 50836.8 )
						if( VIM <= 1.64633 )
							if( ad_mf <= 26888.7 )
								ret := 0.357843
							if( ad_mf > 26888.7 )
								ret := -0.222222
						if( VIM > 1.64633 )
							if( VIP_VIM <= 0.548579 )
								ret := 0.655172
							if( VIP_VIM > 0.548579 )
								ret := 0.111111
					if( ad > 50836.8 )
						if( ad <= 62083.6 )
							ret := -1.000000 // sell
						if( ad > 62083.6 )
							ret := -0.100000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_CRWD_1Min_73f1ff33(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

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


