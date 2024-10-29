//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: BNBUSDT_15Min_2CS0_24c60d5f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BNBUSDT_15Min_2CS0_24c60d5f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BNBUSDT_15Min_24c60d5f(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7,max_features=sqrt, min_samples_leaf=4,random_state=843828734)
	if( k <= 37.8674 )
		if( d <= 10.7008 )
			if( mf <= 0.040816 )
				if( rsi1 <= 32.6884 )
					if( rsi1 <= 25.2814 )
						if( mf <= -0.210135 )
							if( ad_mf <= 5202.3 )
								ret := -0.181948
							if( ad_mf > 5202.3 )
								ret := 0.488889
						if( mf > -0.210135 )
							if( mf <= -0.076586 )
								ret := -0.492528
							if( mf > -0.076586 )
								ret := -0.691443
					if( rsi1 > 25.2814 )
						if( mf <= -0.077768 )
							if( ad_mf <= 2072.1 )
								ret := -0.367222
							if( ad_mf > 2072.1 )
								ret := 0.053763
						if( mf > -0.077768 )
							if( d_k <= 8.56363 )
								ret := -0.461370
							if( d_k > 8.56363 )
								ret := 0.478261
				if( rsi1 > 32.6884 )
					if( ad_mf <= 1448.18 )
						if( d_k <= -3.04652 )
							if( smoothD_d <= 1.62596 )
								ret := -0.535354
							if( smoothD_d > 1.62596 )
								ret := -0.281490
						if( d_k > -3.04652 )
							if( rsi1 <= 46.2859 )
								ret := -0.094943
							if( rsi1 > 46.2859 )
								ret := 0.237838
					if( ad_mf > 1448.18 )
						if( ad_mf <= 1626.37 )
							if( mf <= -0.084585 )
								ret := -0.892857 // sell
							if( mf > -0.084585 )
								ret := -0.586667
						if( ad_mf > 1626.37 )
							if( rsi1 <= 47.9111 )
								ret := -0.370892
							if( rsi1 > 47.9111 )
								ret := -0.035714
			if( mf > 0.040816 )
				if( rsi1 <= 39.3697 )
					if( smoothK_k <= 1.98461 )
						if( rsi1 <= 28.3126 )
							if( d_k <= 0.294223 )
								ret := -0.777126 // sell
							if( d_k > 0.294223 )
								ret := -0.682589
						if( rsi1 > 28.3126 )
							if( smoothD_d <= -2.97609 )
								ret := -0.210000
							if( smoothD_d > -2.97609 )
								ret := -0.604821
					if( smoothK_k > 1.98461 )
						if( d_k <= -5.40127 )
							if( d_k <= -8.71083 )
								ret := -0.392157
							if( d_k > -8.71083 )
								ret := -0.818605 // sell
						if( d_k > -5.40127 )
							if( smoothD_d <= 5.24714 )
								ret := -0.581653
							if( smoothD_d > 5.24714 )
								ret := -0.285714
				if( rsi1 > 39.3697 )
					if( ad_mf <= 1237.84 )
						if( rsi1 <= 50.9283 )
							if( smoothK_k <= 7.10902 )
								ret := -0.253118
							if( smoothK_k > 7.10902 )
								ret := -0.407186
						if( rsi1 > 50.9283 )
							if( ad_mf <= -15835.5 )
								ret := -0.568627
							if( ad_mf > -15835.5 )
								ret := 0.043155
					if( ad_mf > 1237.84 )
						if( smoothK_k <= 13.8123 )
							if( ad_mf <= 4146.59 )
								ret := -0.477547
							if( ad_mf > 4146.59 )
								ret := -0.626126
						if( smoothK_k > 13.8123 )
							if( ad_mf <= 4309.62 )
								ret := -0.379310
							if( ad_mf > 4309.62 )
								ret := 0.548387
		if( d > 10.7008 )
			if( ad_mf <= 328.816 )
				if( ad_mf <= -9223.53 )
					if( rsi1 <= 48.3577 )
						if( d <= 37.1861 )
							if( ad <= -11161.6 )
								ret := -0.044101
							if( ad > -11161.6 )
								ret := 0.264798
						if( d > 37.1861 )
							if( ad_mf <= -70094.8 )
								ret := 1.000000 // buy
							if( ad_mf > -70094.8 )
								ret := -0.344828
					if( rsi1 > 48.3577 )
						if( k <= 15.4402 )
							if( rsi1 <= 58.4505 )
								ret := 0.133333
							if( rsi1 > 58.4505 )
								ret := -0.428571
						if( k > 15.4402 )
							if( mf <= -0.07275 )
								ret := -0.444444
							if( mf > -0.07275 )
								ret := 0.473469
				if( ad_mf > -9223.53 )
					if( d_k <= 5.49295 )
						if( mf <= 0.019379 )
							if( rsi1 <= 39.7971 )
								ret := -0.134899
							if( rsi1 > 39.7971 )
								ret := 0.146401
						if( mf > 0.019379 )
							if( k <= 21.3911 )
								ret := -0.230670
							if( k > 21.3911 )
								ret := -0.037396
					if( d_k > 5.49295 )
						if( rsi1 <= 42.1857 )
							if( d_k <= 10.6782 )
								ret := -0.182090
							if( d_k > 10.6782 )
								ret := -0.317084
						if( rsi1 > 42.1857 )
							if( smoothD_d <= 17.1962 )
								ret := -0.173239
							if( smoothD_d > 17.1962 )
								ret := 0.002322
			if( ad_mf > 328.816 )
				if( smoothK_k <= 10.2925 )
					if( ad_mf <= 3842.42 )
						if( ad_mf <= 3742.25 )
							if( rsi1 <= 42.8079 )
								ret := -0.439610
							if( rsi1 > 42.8079 )
								ret := -0.099415
						if( ad_mf > 3742.25 )
							if( rsi1 <= 30.6401 )
								ret := -0.777778 // sell
							if( rsi1 > 30.6401 )
								ret := 0.604651
					if( ad_mf > 3842.42 )
						if( d_k <= 16.3804 )
							if( rsi1 <= 37.3444 )
								ret := -0.734317 // sell
							if( rsi1 > 37.3444 )
								ret := -0.469512
						if( d_k > 16.3804 )
							if( mf <= 0.196863 )
								ret := -0.586957
							if( mf > 0.196863 )
								ret := 0.285714
				if( smoothK_k > 10.2925 )
					if( rsi1 <= 41.3251 )
						if( smoothD_d <= 25.8855 )
							if( ad_mf <= 19083 )
								ret := -0.326689
							if( ad_mf > 19083 )
								ret := 0.247312
						if( smoothD_d > 25.8855 )
							if( smoothK_k <= 20.5226 )
								ret := -0.581114
							if( smoothK_k > 20.5226 )
								ret := -0.426096
					if( rsi1 > 41.3251 )
						if( ad <= 7811.14 )
							if( ad_mf <= 5895.31 )
								ret := -0.134608
							if( ad_mf > 5895.31 )
								ret := 0.162281
						if( ad > 7811.14 )
							if( d <= 55.0738 )
								ret := -0.374808
							if( d > 55.0738 )
								ret := 0.526316
	if( k > 37.8674 )
		if( rsi1 <= 57.2659 )
			if( smoothK_k <= 83.2373 )
				if( ad_mf <= -382.477 )
					if( ad <= -17677.8 )
						if( d_k <= 0.954977 )
							if( ad_mf <= -43083.1 )
								ret := 0.951220 // buy
							if( ad_mf > -43083.1 )
								ret := 0.491289
						if( d_k > 0.954977 )
							if( smoothK_k <= 70.1031 )
								ret := 0.112782
							if( smoothK_k > 70.1031 )
								ret := -0.473684
					if( ad > -17677.8 )
						if( d_k <= 0.587017 )
							if( rsi1 <= 33.77 )
								ret := -0.247878
							if( rsi1 > 33.77 )
								ret := 0.172281
						if( d_k > 0.587017 )
							if( ad <= -6069.95 )
								ret := -0.223419
							if( ad > -6069.95 )
								ret := 0.067735
				if( ad_mf > -382.477 )
					if( rsi1 <= 46.2145 )
						if( ad <= 877.753 )
							if( smoothD_d <= 84.5906 )
								ret := -0.083012
							if( smoothD_d > 84.5906 )
								ret := 0.362637
						if( ad > 877.753 )
							if( smoothD_d <= 41.457 )
								ret := -0.082753
							if( smoothD_d > 41.457 )
								ret := -0.289003
					if( rsi1 > 46.2145 )
						if( smoothK_k <= 55.3348 )
							if( smoothD_d <= 43.6732 )
								ret := 0.091805
							if( smoothD_d > 43.6732 )
								ret := -0.251293
						if( smoothK_k > 55.3348 )
							if( smoothD_d <= 62.0002 )
								ret := 0.116686
							if( smoothD_d > 62.0002 )
								ret := -0.013274
			if( smoothK_k > 83.2373 )
				if( ad_mf <= -1664.87 )
					if( ad_mf <= -1816.75 )
						if( d <= 89.6889 )
							if( smoothD_d <= 72.4523 )
								ret := 0.177273
							if( smoothD_d > 72.4523 )
								ret := 0.430362
						if( d > 89.6889 )
							if( smoothK_k <= 84.8377 )
								ret := -0.390244
							if( smoothK_k > 84.8377 )
								ret := 0.228960
					if( ad_mf > -1816.75 )
						if( smoothK_k <= 85.3584 )
							ret := -0.333333
						if( smoothK_k > 85.3584 )
							if( rsi1 <= 55.8981 )
								ret := 0.870130 // buy
							if( rsi1 > 55.8981 )
								ret := 0.200000
				if( ad_mf > -1664.87 )
					if( smoothD_d <= 86.6556 )
						if( rsi1 <= 36.4848 )
							if( mf <= -0.083132 )
								ret := -0.047619
							if( mf > -0.083132 )
								ret := -0.511628
						if( rsi1 > 36.4848 )
							if( ad <= -1579.06 )
								ret := -0.625000
							if( ad > -1579.06 )
								ret := 0.094365
					if( smoothD_d > 86.6556 )
						if( ad <= 23112.2 )
							if( d_k <= 1.33954 )
								ret := 0.170088
							if( d_k > 1.33954 )
								ret := 0.274384
						if( ad > 23112.2 )
							if( smoothD_d <= 94.4903 )
								ret := 1.000000 // buy
							if( smoothD_d > 94.4903 )
								ret := 0.739130 // buy
		if( rsi1 > 57.2659 )
			if( smoothK_k <= 72.3389 )
				if( d <= 71.1048 )
					if( mf <= 0.133526 )
						if( ad_mf <= -0.039301 )
							if( d_k <= 1.47944 )
								ret := 0.393130
							if( d_k > 1.47944 )
								ret := 0.097595
						if( ad_mf > -0.039301 )
							if( k <= 68.1524 )
								ret := 0.095238
							if( k > 68.1524 )
								ret := 0.292632
					if( mf > 0.133526 )
						if( rsi1 <= 76.2353 )
							if( d_k <= 18.1195 )
								ret := 0.007158
							if( d_k > 18.1195 )
								ret := 0.509434
						if( rsi1 > 76.2353 )
							if( k <= 59.9171 )
								ret := 0.650000
							if( k > 59.9171 )
								ret := 0.290323
				if( d > 71.1048 )
					if( d_k <= 9.39714 )
						if( ad <= 2468.64 )
							if( mf <= 0.101528 )
								ret := 0.343470
							if( mf > 0.101528 )
								ret := 0.094571
						if( ad > 2468.64 )
							if( ad <= 2508.65 )
								ret := -0.937500 // sell
							if( ad > 2508.65 )
								ret := 0.051454
					if( d_k > 9.39714 )
						if( d_k <= 16.3858 )
							if( ad <= 17427.8 )
								ret := 0.430532
							if( ad > 17427.8 )
								ret := -0.250000
						if( d_k > 16.3858 )
							if( ad_mf <= 589.976 )
								ret := -0.010417
							if( ad_mf > 589.976 )
								ret := 0.561538
			if( smoothK_k > 72.3389 )
				if( mf <= 0.044446 )
					if( smoothD_d <= 91.1676 )
						if( ad_mf <= -774.714 )
							if( d_k <= -3.17979 )
								ret := 0.640278
							if( d_k > -3.17979 )
								ret := 0.430689
						if( ad_mf > -774.714 )
							if( rsi1 <= 65.1759 )
								ret := 0.300431
							if( rsi1 > 65.1759 )
								ret := 0.469574
					if( smoothD_d > 91.1676 )
						if( smoothK_k <= 96.9985 )
							if( rsi1 <= 66.675 )
								ret := 0.448995
							if( rsi1 > 66.675 )
								ret := 0.697831
						if( smoothK_k > 96.9985 )
							if( rsi1 <= 75.4827 )
								ret := 0.330739
							if( rsi1 > 75.4827 )
								ret := 0.630769
				if( mf > 0.044446 )
					if( smoothK_k <= 94.5927 )
						if( ad <= 11968.6 )
							if( ad_mf <= 11818 )
								ret := 0.285465
							if( ad_mf > 11818 )
								ret := -0.800000 // sell
						if( ad > 11968.6 )
							if( ad_mf <= 12655.4 )
								ret := 0.883721 // buy
							if( ad_mf > 12655.4 )
								ret := 0.422452
					if( smoothK_k > 94.5927 )
						if( smoothK_k <= 96.9996 )
							if( rsi1 <= 79.2377 )
								ret := 0.376006
							if( rsi1 > 79.2377 )
								ret := 0.639706
						if( smoothK_k > 96.9996 )
							if( d_k <= -3.49704 )
								ret := 0.284444
							if( d_k > -3.49704 )
								ret := 0.382838
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
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
float op_operation = decision_tree_0_BNBUSDT_15Min_24c60d5f(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


