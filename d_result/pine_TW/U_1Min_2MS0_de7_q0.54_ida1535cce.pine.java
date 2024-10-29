//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: U_1Min_2MS0_a1535cce Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2MS0_a1535cce", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_a1535cce(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( Negative_Money_Flow <= 1.08237 )
		if( Negative_Money_Flow_Sum <= 299427 )
			if( rsi1 <= 51.7539 )
				if( Negative_Money_Flow_Sum <= 119944 )
					if( Positive_Money_Flow_Sum <= 45654.4 )
						if( Positive_Money_Flow <= 12668 )
							if( Positive_Money_Flow_Sum <= 31649 )
								ret := 0.069054
							if( Positive_Money_Flow_Sum > 31649 )
								ret := 0.435262
						if( Positive_Money_Flow > 12668 )
							if( smoothD_d <= 37.3146 )
								ret := -0.513514
							if( smoothD_d > 37.3146 )
								ret := 0.083333
					if( Positive_Money_Flow_Sum > 45654.4 )
						if( Positive_Money_Flow <= 45967.9 )
							if( Typical_Price <= 14.6128 )
								ret := 0.656250
							if( Typical_Price > 14.6128 )
								ret := -0.018578
						if( Positive_Money_Flow > 45967.9 )
							if( rsi1 <= 44.6551 )
								ret := 0.661765
							if( rsi1 > 44.6551 )
								ret := 0.122642
				if( Negative_Money_Flow_Sum > 119944 )
					if( Money_Flow_Ratio <= 0.618456 )
						if( d_k <= -1.45018 )
							if( Raw_Money_Flow <= 10044.8 )
								ret := -0.331776
							if( Raw_Money_Flow > 10044.8 )
								ret := -0.017045
						if( d_k > -1.45018 )
							if( Negative_Money_Flow_Sum <= 154139 )
								ret := 0.433824
							if( Negative_Money_Flow_Sum > 154139 )
								ret := 0.066066
					if( Money_Flow_Ratio > 0.618456 )
						if( Money_Flow_Ratio <= 16.1565 )
							if( Negative_Money_Flow_Sum <= 189980 )
								ret := -0.363636
							if( Negative_Money_Flow_Sum > 189980 )
								ret := 0.020161
						if( Money_Flow_Ratio > 16.1565 )
							if( Negative_Money_Flow_Sum <= 141998 )
								ret := 0.875000 // buy
							if( Negative_Money_Flow_Sum > 141998 )
								ret := 0.125000
			if( rsi1 > 51.7539 )
				if( smoothD_d <= 84.9538 )
					if( Positive_Money_Flow <= 716.86 )
						if( Typical_Price <= 19.776 )
							if( d <= 50.6768 )
								ret := -0.276730
							if( d > 50.6768 )
								ret := -0.012085
						if( Typical_Price > 19.776 )
							if( Positive_Money_Flow <= 33.699 )
								ret := 0.068273
							if( Positive_Money_Flow > 33.699 )
								ret := 0.857143 // buy
					if( Positive_Money_Flow > 716.86 )
						if( Raw_Money_Flow <= 191679 )
							if( d_k <= -0.673881 )
								ret := -0.353254
							if( d_k > -0.673881 )
								ret := -0.181818
						if( Raw_Money_Flow > 191679 )
							if( rsi1 <= 62.4957 )
								ret := -0.168224
							if( rsi1 > 62.4957 )
								ret := 0.400000
				if( smoothD_d > 84.9538 )
					if( Typical_Price <= 15.4415 )
						if( d <= 93.2674 )
							if( d_k <= -1.65094 )
								ret := 0.461538
							if( d_k > -1.65094 )
								ret := -0.588235
						if( d > 93.2674 )
							if( Negative_Money_Flow_Sum <= 114437 )
								ret := 0.754386 // buy
							if( Negative_Money_Flow_Sum > 114437 )
								ret := 0.187500
					if( Typical_Price > 15.4415 )
						if( MFI_High <= 18.1655 )
							if( MFI_High <= -1.07131 )
								ret := -0.140594
							if( MFI_High > -1.07131 )
								ret := 0.102679
						if( MFI_High > 18.1655 )
							if( Positive_Money_Flow <= 273709 )
								ret := -0.125000
							if( Positive_Money_Flow > 273709 )
								ret := -0.807692 // sell
		if( Negative_Money_Flow_Sum > 299427 )
			if( Negative_Money_Flow_Sum <= 1.64731e+07 )
				if( Negative_Money_Flow_Sum <= 7.06043e+06 )
					if( d <= 46.5597 )
						if( Typical_Price <= 16.3545 )
							if( Positive_Money_Flow_Sum <= 1.62953e+06 )
								ret := 0.127592
							if( Positive_Money_Flow_Sum > 1.62953e+06 )
								ret := -0.017766
						if( Typical_Price > 16.3545 )
							if( Money_Flow_Ratio <= 7.6485 )
								ret := -0.014448
							if( Money_Flow_Ratio > 7.6485 )
								ret := -0.447368
					if( d > 46.5597 )
						if( d <= 96.3512 )
							if( Positive_Money_Flow_Sum <= 1.60714e+07 )
								ret := 0.084199
							if( Positive_Money_Flow_Sum > 1.60714e+07 )
								ret := -0.176471
						if( d > 96.3512 )
							if( Positive_Money_Flow_Sum <= 5.96582e+06 )
								ret := 0.012195
							if( Positive_Money_Flow_Sum > 5.96582e+06 )
								ret := -0.182957
				if( Negative_Money_Flow_Sum > 7.06043e+06 )
					if( rsi1 <= 68.8832 )
						if( MFI_High <= -14.5916 )
							if( Negative_Money_Flow_Sum <= 1.22702e+07 )
								ret := 0.188782
							if( Negative_Money_Flow_Sum > 1.22702e+07 )
								ret := -0.038674
						if( MFI_High > -14.5916 )
							if( Typical_Price <= 21.5801 )
								ret := -0.080645
							if( Typical_Price > 21.5801 )
								ret := -0.738095 // sell
					if( rsi1 > 68.8832 )
						if( Positive_Money_Flow <= 1.01078e+07 )
							if( Positive_Money_Flow_Sum <= 1.51779e+07 )
								ret := 0.115385
							if( Positive_Money_Flow_Sum > 1.51779e+07 )
								ret := 0.767241 // buy
						if( Positive_Money_Flow > 1.01078e+07 )
							if( MFI_High <= -7.42979 )
								ret := 0.142857
							if( MFI_High > -7.42979 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 1.64731e+07 )
				if( rsi1 <= 49.2318 )
					if( d <= 68.0112 )
						if( Raw_Money_Flow <= 2.07054e+06 )
							if( Typical_Price <= 23.068 )
								ret := 0.322870
							if( Typical_Price > 23.068 )
								ret := -0.363636
						if( Raw_Money_Flow > 2.07054e+06 )
							if( d_k <= -9.13162 )
								ret := 0.818182 // buy
							if( d_k > -9.13162 )
								ret := -0.519231
					if( d > 68.0112 )
						if( Positive_Money_Flow <= 972782 )
							if( Negative_Money_Flow_Sum <= 2.32084e+07 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 2.32084e+07 )
								ret := -0.428571
						if( Positive_Money_Flow > 972782 )
							if( Typical_Price <= 21.4761 )
								ret := -0.769231 // sell
							if( Typical_Price > 21.4761 )
								ret := -0.956522 // sell
				if( rsi1 > 49.2318 )
					if( MFI_High <= -27.6394 )
						if( Typical_Price <= 16.1873 )
							if( d_k <= 1.11061 )
								ret := 0.590909
							if( d_k > 1.11061 )
								ret := -0.857143 // sell
						if( Typical_Price > 16.1873 )
							if( d_k <= -0.109594 )
								ret := -0.647059
							if( d_k > -0.109594 )
								ret := -0.162791
					if( MFI_High > -27.6394 )
						if( Typical_Price <= 17.8236 )
							ret := -1.000000 // sell
						if( Typical_Price > 17.8236 )
							if( smoothK_k <= 31.9048 )
								ret := -1.000000 // sell
							if( smoothK_k > 31.9048 )
								ret := -0.421053
	if( Negative_Money_Flow > 1.08237 )
		if( Negative_Money_Flow_Sum <= 353461 )
			if( rsi1 <= 52.318 )
				if( MFI_High <= -64.7595 )
					if( Negative_Money_Flow_Sum <= 303994 )
						if( Typical_Price <= 21.7258 )
							if( smoothD_d <= 27.4533 )
								ret := 0.389222
							if( smoothD_d > 27.4533 )
								ret := 0.654639
						if( Typical_Price > 21.7258 )
							if( rsi1 <= 35.136 )
								ret := 0.500000
							if( rsi1 > 35.136 )
								ret := -0.307692
					if( Negative_Money_Flow_Sum > 303994 )
						if( Negative_Money_Flow_Sum <= 336532 )
							if( Typical_Price <= 22.2708 )
								ret := 0.927536 // buy
							if( Typical_Price > 22.2708 )
								ret := 0.571429
						if( Negative_Money_Flow_Sum > 336532 )
							if( Negative_Money_Flow <= 9188.55 )
								ret := 0.857143 // buy
							if( Negative_Money_Flow > 9188.55 )
								ret := 0.100000
				if( MFI_High > -64.7595 )
					if( Money_Flow_Ratio <= 0.272815 )
						if( Negative_Money_Flow_Sum <= 103724 )
							if( d_k <= 2.07744 )
								ret := 0.208333
							if( d_k > 2.07744 )
								ret := 0.723077 // buy
						if( Negative_Money_Flow_Sum > 103724 )
							if( Raw_Money_Flow <= 82840.3 )
								ret := -0.083565
							if( Raw_Money_Flow > 82840.3 )
								ret := 0.682927
					if( Money_Flow_Ratio > 0.272815 )
						if( rsi1 <= 35.5672 )
							if( Negative_Money_Flow_Sum <= 27917.2 )
								ret := -0.600000
							if( Negative_Money_Flow_Sum > 27917.2 )
								ret := 0.433785
						if( rsi1 > 35.5672 )
							if( MFI_High <= 12.2139 )
								ret := 0.238852
							if( MFI_High > 12.2139 )
								ret := 0.595238
			if( rsi1 > 52.318 )
				if( d_k <= -6.59076 )
					if( Negative_Money_Flow_Sum <= 183202 )
						if( Positive_Money_Flow <= 763.137 )
							if( Raw_Money_Flow <= 57763.3 )
								ret := -0.187067
							if( Raw_Money_Flow > 57763.3 )
								ret := -0.789474 // sell
						if( Positive_Money_Flow > 763.137 )
							if( Negative_Money_Flow <= 283.274 )
								ret := 0.428571
							if( Negative_Money_Flow > 283.274 )
								ret := -0.682540
					if( Negative_Money_Flow_Sum > 183202 )
						if( Negative_Money_Flow_Sum <= 210875 )
							if( Raw_Money_Flow <= 11870 )
								ret := 0.875000 // buy
							if( Raw_Money_Flow > 11870 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 210875 )
							if( Positive_Money_Flow <= 6643.13 )
								ret := -0.144578
							if( Positive_Money_Flow > 6643.13 )
								ret := 0.818182 // buy
				if( d_k > -6.59076 )
					if( Raw_Money_Flow <= 18872.3 )
						if( Positive_Money_Flow_Sum <= 414837 )
							if( Negative_Money_Flow_Sum <= 26792.5 )
								ret := 0.448000
							if( Negative_Money_Flow_Sum > 26792.5 )
								ret := 0.032753
						if( Positive_Money_Flow_Sum > 414837 )
							if( Positive_Money_Flow_Sum <= 670978 )
								ret := -0.445652
							if( Positive_Money_Flow_Sum > 670978 )
								ret := 0.145833
					if( Raw_Money_Flow > 18872.3 )
						if( d <= 19.4336 )
							if( Raw_Money_Flow <= 30788 )
								ret := 0.300000
							if( Raw_Money_Flow > 30788 )
								ret := 0.840000 // buy
						if( d > 19.4336 )
							if( Positive_Money_Flow_Sum <= 43074.8 )
								ret := 0.608696
							if( Positive_Money_Flow_Sum > 43074.8 )
								ret := 0.162162
		if( Negative_Money_Flow_Sum > 353461 )
			if( Negative_Money_Flow_Sum <= 8.34918e+06 )
				if( Money_Flow_Ratio <= 9.69369 )
					if( k <= 46.8072 )
						if( Money_Flow_Ratio <= 0.137833 )
							if( Typical_Price <= 21.6312 )
								ret := 0.234171
							if( Typical_Price > 21.6312 )
								ret := -0.195876
						if( Money_Flow_Ratio > 0.137833 )
							if( Negative_Money_Flow_Sum <= 8.24331e+06 )
								ret := -0.001321
							if( Negative_Money_Flow_Sum > 8.24331e+06 )
								ret := -0.600000
					if( k > 46.8072 )
						if( Positive_Money_Flow_Sum <= 4.25014e+06 )
							if( Negative_Money_Flow_Sum <= 2.62819e+06 )
								ret := 0.077063
							if( Negative_Money_Flow_Sum > 2.62819e+06 )
								ret := -0.027837
						if( Positive_Money_Flow_Sum > 4.25014e+06 )
							if( Typical_Price <= 21.1442 )
								ret := 0.243515
							if( Typical_Price > 21.1442 )
								ret := 0.022727
				if( Money_Flow_Ratio > 9.69369 )
					if( k <= 92.0075 )
						if( d <= 43.1239 )
							if( rsi1 <= 45.2111 )
								ret := 0.857143 // buy
							if( rsi1 > 45.2111 )
								ret := 0.130435
						if( d > 43.1239 )
							if( Raw_Money_Flow <= 254819 )
								ret := 0.583333
							if( Raw_Money_Flow > 254819 )
								ret := 0.954545 // buy
					if( k > 92.0075 )
						if( Raw_Money_Flow <= 297043 )
							ret := 0.111111
						if( Raw_Money_Flow > 297043 )
							ret := -0.571429
			if( Negative_Money_Flow_Sum > 8.34918e+06 )
				if( Positive_Money_Flow <= 15967.7 )
					if( rsi1 <= 40.6391 )
						if( Typical_Price <= 21.4645 )
							if( Negative_Money_Flow_Sum <= 1.48224e+07 )
								ret := 0.197917
							if( Negative_Money_Flow_Sum > 1.48224e+07 )
								ret := 0.627358
						if( Typical_Price > 21.4645 )
							if( Negative_Money_Flow_Sum <= 2.10538e+07 )
								ret := 0.171053
							if( Negative_Money_Flow_Sum > 2.10538e+07 )
								ret := -0.173913
					if( rsi1 > 40.6391 )
						if( Money_Flow_Ratio <= 0.9847 )
							if( d <= 94.827 )
								ret := -0.021148
							if( d > 94.827 )
								ret := -0.685714
						if( Money_Flow_Ratio > 0.9847 )
							if( Positive_Money_Flow_Sum <= 1.90005e+07 )
								ret := 0.560150
							if( Positive_Money_Flow_Sum > 1.90005e+07 )
								ret := -0.027907
				if( Positive_Money_Flow > 15967.7 )
					if( k <= 13.4535 )
						if( Negative_Money_Flow <= 1.09998e+06 )
							if( Typical_Price <= 17.9887 )
								ret := 0.176471
							if( Typical_Price > 17.9887 )
								ret := 0.700000 // buy
						if( Negative_Money_Flow > 1.09998e+06 )
							ret := -0.454545
					if( k > 13.4535 )
						if( Negative_Money_Flow <= 47075.5 )
							if( MFI_Low <= 22.675 )
								ret := -0.207547
							if( MFI_Low > 22.675 )
								ret := 0.700000 // buy
						if( Negative_Money_Flow > 47075.5 )
							if( d_k <= 11.3779 )
								ret := -0.443850
							if( d_k > 11.3779 )
								ret := 0.714286 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_U_1Min_a1535cce(Typical_Price, MFI_High, Negative_Money_Flow, Positive_Money_Flow, Money_Flow_Ratio, MFI, Negative_Money_Flow_Sum, Positive_Money_Flow_Sum, MFI_Low, Raw_Money_Flow, rsi1, d, k, smoothD_d, d_k, smoothK_k)

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


