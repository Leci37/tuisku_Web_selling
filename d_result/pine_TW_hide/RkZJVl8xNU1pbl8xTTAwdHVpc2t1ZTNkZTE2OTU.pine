//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: FFIV_15Min_1M00_e3de1695 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_1M00_e3de1695", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_e3de1695(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Negative_Money_Flow <= 1.14997e+07 )
		if( Negative_Money_Flow_Sum <= 1.70416e+08 )
			if( Positive_Money_Flow_Sum <= 9.52303e+07 )
				if( Money_Flow_Ratio <= 13.0752 )
					if( MFI_Low <= 70.1399 )
						if( Positive_Money_Flow_Sum <= 9.01576e+07 )
							if( Typical_Price <= 144.641 )
								if( Money_Flow_Ratio <= 6.13934 )
									ret := 0.030033
								if( Money_Flow_Ratio > 6.13934 )
									ret := 0.358108
							if( Typical_Price > 144.641 )
								if( MFI_Low <= -1.59005 )
									ret := 0.063499
								if( MFI_Low > -1.59005 )
									ret := -0.040948
						if( Positive_Money_Flow_Sum > 9.01576e+07 )
							if( MFI_Low <= 39.7496 )
								if( Positive_Money_Flow_Sum <= 9.42743e+07 )
									ret := -0.357143
								if( Positive_Money_Flow_Sum > 9.42743e+07 )
									ret := -0.818182 // sell
							if( MFI_Low > 39.7496 )
								if( MFI_High <= 3.94216 )
									ret := 0.760479 // buy
								if( MFI_High > 3.94216 )
									ret := 0.284091
					if( MFI_Low > 70.1399 )
						if( Positive_Money_Flow <= 3.04709e+06 )
							if( Raw_Money_Flow <= 70753.1 )
								if( Negative_Money_Flow_Sum <= 4.89224e+06 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 4.89224e+06 )
									ret := -0.592593
							if( Raw_Money_Flow > 70753.1 )
								if( Positive_Money_Flow_Sum <= 8.51671e+07 )
									ret := -0.125000
								if( Positive_Money_Flow_Sum > 8.51671e+07 )
									ret := -0.788462 // sell
						if( Positive_Money_Flow > 3.04709e+06 )
							if( Typical_Price <= 169.995 )
								if( Negative_Money_Flow_Sum <= 5.42257e+06 )
									ret := 0.533898
								if( Negative_Money_Flow_Sum > 5.42257e+06 )
									ret := -0.046154
							if( Typical_Price > 169.995 )
								if( MFI_High <= 11.7308 )
									ret := -0.435294
								if( MFI_High > 11.7308 )
									ret := -0.702703 // sell
				if( Money_Flow_Ratio > 13.0752 )
					if( Typical_Price <= 139.817 )
						if( Money_Flow_Ratio <= 59.0041 )
							if( Money_Flow_Ratio <= 19.5152 )
								if( Typical_Price <= 117.174 )
									ret := 1.000000 // buy
								if( Typical_Price > 117.174 )
									ret := 0.691176
							if( Money_Flow_Ratio > 19.5152 )
								if( MFI <= 97.3988 )
									ret := 0.357143
								if( MFI > 97.3988 )
									ret := 0.789474 // buy
						if( Money_Flow_Ratio > 59.0041 )
							if( Positive_Money_Flow_Sum <= 7.00842e+07 )
								ret := 0.384615
							if( Positive_Money_Flow_Sum > 7.00842e+07 )
								if( MFI <= 98.7693 )
									ret := -0.333333
								if( MFI > 98.7693 )
									ret := -0.250000
					if( Typical_Price > 139.817 )
						if( Negative_Money_Flow_Sum <= 3.31399e+06 )
							if( Positive_Money_Flow_Sum <= 4.99898e+07 )
								if( Typical_Price <= 205.215 )
									ret := -0.254545
								if( Typical_Price > 205.215 )
									ret := 0.461538
							if( Positive_Money_Flow_Sum > 4.99898e+07 )
								if( Raw_Money_Flow <= 2.51671e+06 )
									ret := 0.059701
								if( Raw_Money_Flow > 2.51671e+06 )
									ret := 0.568182
						if( Negative_Money_Flow_Sum > 3.31399e+06 )
							if( Typical_Price <= 184.945 )
								if( Money_Flow_Ratio <= 14.0716 )
									ret := 0.833333 // buy
								if( Money_Flow_Ratio > 14.0716 )
									ret := 0.253425
							if( Typical_Price > 184.945 )
								if( Typical_Price <= 196.821 )
									ret := -0.481481
								if( Typical_Price > 196.821 )
									ret := 0.043478
			if( Positive_Money_Flow_Sum > 9.52303e+07 )
				if( Positive_Money_Flow <= 2.0861e+06 )
					if( Typical_Price <= 205.417 )
						if( Raw_Money_Flow <= 4.01023e+06 )
							if( Negative_Money_Flow <= 1.55193e+06 )
								if( MFI_Low <= 46.8207 )
									ret := -0.750000 // sell
								if( MFI_Low > 46.8207 )
									ret := 0.181395
							if( Negative_Money_Flow > 1.55193e+06 )
								if( Money_Flow_Ratio <= 24.3935 )
									ret := -0.297398
								if( Money_Flow_Ratio > 24.3935 )
									ret := 0.600000
						if( Raw_Money_Flow > 4.01023e+06 )
							if( MFI <= 87.4563 )
								if( Money_Flow_Ratio <= 4.54812 )
									ret := 0.258503
								if( Money_Flow_Ratio > 4.54812 )
									ret := -0.382353
							if( MFI > 87.4563 )
								if( Negative_Money_Flow_Sum <= 1.19423e+07 )
									ret := 0.291667
								if( Negative_Money_Flow_Sum > 1.19423e+07 )
									ret := 0.942857 // buy
					if( Typical_Price > 205.417 )
						if( Positive_Money_Flow_Sum <= 1.30045e+08 )
							if( MFI_Low <= 64.7025 )
								if( MFI <= 73.5729 )
									ret := -0.454545
								if( MFI > 73.5729 )
									ret := 0.363636
							if( MFI_Low > 64.7025 )
								ret := -0.642857
						if( Positive_Money_Flow_Sum > 1.30045e+08 )
							if( Money_Flow_Ratio <= 9.60992 )
								if( MFI_High <= 2.32327 )
									ret := -0.687500
								if( MFI_High > 2.32327 )
									ret := -1.000000 // sell
							if( Money_Flow_Ratio > 9.60992 )
								ret := -0.600000
				if( Positive_Money_Flow > 2.0861e+06 )
					if( Negative_Money_Flow_Sum <= 7.18814e+07 )
						if( Typical_Price <= 135.847 )
							if( MFI <= 70.0933 )
								ret := 0.733333 // buy
							if( MFI > 70.0933 )
								if( Positive_Money_Flow_Sum <= 1.08617e+08 )
									ret := -0.549020
								if( Positive_Money_Flow_Sum > 1.08617e+08 )
									ret := 0.062500
						if( Typical_Price > 135.847 )
							if( MFI_Low <= 65.8516 )
								if( Positive_Money_Flow_Sum <= 1.05126e+08 )
									ret := -0.413793
								if( Positive_Money_Flow_Sum > 1.05126e+08 )
									ret := -0.724299 // sell
							if( MFI_Low > 65.8516 )
								if( MFI <= 95.0119 )
									ret := -0.030457
								if( MFI > 95.0119 )
									ret := -0.660194
					if( Negative_Money_Flow_Sum > 7.18814e+07 )
						if( MFI_Low <= 41.7523 )
							if( Negative_Money_Flow_Sum <= 1.03261e+08 )
								if( Typical_Price <= 173.851 )
									ret := 1.000000 // buy
								if( Typical_Price > 173.851 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 1.03261e+08 )
								if( Positive_Money_Flow <= 1.64349e+07 )
									ret := -0.687500
								if( Positive_Money_Flow > 1.64349e+07 )
									ret := 0.533333
						if( MFI_Low > 41.7523 )
							ret := -0.588235
		if( Negative_Money_Flow_Sum > 1.70416e+08 )
			if( Typical_Price <= 164.765 )
				if( Typical_Price <= 146.196 )
					if( Raw_Money_Flow <= 1.61295e+07 )
						if( Negative_Money_Flow_Sum <= 3.36975e+08 )
							if( Raw_Money_Flow <= 3.79092e+06 )
								if( Raw_Money_Flow <= 2.4601e+06 )
									ret := 0.666667
								if( Raw_Money_Flow > 2.4601e+06 )
									ret := 0.166667
							if( Raw_Money_Flow > 3.79092e+06 )
								if( Negative_Money_Flow <= 129578 )
									ret := 0.800000 // buy
								if( Negative_Money_Flow > 129578 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.36975e+08 )
							ret := -0.166667
					if( Raw_Money_Flow > 1.61295e+07 )
						ret := -0.500000
				if( Typical_Price > 146.196 )
					if( Typical_Price <= 158.299 )
						if( Positive_Money_Flow <= 1.47057e+06 )
							ret := 0.750000 // buy
						if( Positive_Money_Flow > 1.47057e+06 )
							ret := 1.000000 // buy
					if( Typical_Price > 158.299 )
						if( MFI <= 16.5788 )
							ret := 0.277778
						if( MFI > 16.5788 )
							ret := 0.916667 // buy
			if( Typical_Price > 164.765 )
				if( Negative_Money_Flow_Sum <= 2.09994e+08 )
					if( Positive_Money_Flow_Sum <= 1.37192e+07 )
						ret := -0.090909
					if( Positive_Money_Flow_Sum > 1.37192e+07 )
						if( Positive_Money_Flow_Sum <= 6.82123e+07 )
							ret := -1.000000 // sell
						if( Positive_Money_Flow_Sum > 6.82123e+07 )
							ret := -0.777778 // sell
				if( Negative_Money_Flow_Sum > 2.09994e+08 )
					if( Money_Flow_Ratio <= 0.43866 )
						if( Positive_Money_Flow <= 104423 )
							if( Negative_Money_Flow <= 833307 )
								if( Money_Flow_Ratio <= 0.341776 )
									ret := 0.964286 // buy
								if( Money_Flow_Ratio > 0.341776 )
									ret := 0.615385
							if( Negative_Money_Flow > 833307 )
								if( Money_Flow_Ratio <= 0.103275 )
									ret := 0.172414
								if( Money_Flow_Ratio > 0.103275 )
									ret := -0.263158
						if( Positive_Money_Flow > 104423 )
							if( Positive_Money_Flow_Sum <= 1.02924e+08 )
								if( Typical_Price <= 200.162 )
									ret := -0.535211
								if( Typical_Price > 200.162 )
									ret := 0.571429
							if( Positive_Money_Flow_Sum > 1.02924e+08 )
								ret := 1.000000 // buy
					if( Money_Flow_Ratio > 0.43866 )
						ret := 1.000000 // buy
	if( Negative_Money_Flow > 1.14997e+07 )
		if( Positive_Money_Flow_Sum <= 4.22707e+06 )
			if( Raw_Money_Flow <= 2.66516e+07 )
				if( Positive_Money_Flow_Sum <= 2.76093e+06 )
					if( Negative_Money_Flow <= 1.64542e+07 )
						ret := 0.166667
					if( Negative_Money_Flow > 1.64542e+07 )
						if( Raw_Money_Flow <= 1.9257e+07 )
							ret := 1.000000 // buy
						if( Raw_Money_Flow > 1.9257e+07 )
							if( Negative_Money_Flow <= 2.14038e+07 )
								ret := 0.071429
							if( Negative_Money_Flow > 2.14038e+07 )
								ret := 0.785714 // buy
				if( Positive_Money_Flow_Sum > 2.76093e+06 )
					if( Positive_Money_Flow_Sum <= 3.5061e+06 )
						if( MFI_High <= -74.0083 )
							ret := -0.250000
						if( MFI_High > -74.0083 )
							if( Negative_Money_Flow_Sum <= 3.56508e+07 )
								ret := -0.333333
							if( Negative_Money_Flow_Sum > 3.56508e+07 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 3.5061e+06 )
						if( Negative_Money_Flow <= 1.75589e+07 )
							if( Money_Flow_Ratio <= 0.11329 )
								ret := 0.875000 // buy
							if( Money_Flow_Ratio > 0.11329 )
								ret := 0.285714
						if( Negative_Money_Flow > 1.75589e+07 )
							ret := -0.400000
			if( Raw_Money_Flow > 2.66516e+07 )
				if( Positive_Money_Flow_Sum <= 2.76125e+06 )
					if( MFI_High <= -77.7471 )
						ret := -0.777778 // sell
					if( MFI_High > -77.7471 )
						ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 2.76125e+06 )
					if( Typical_Price <= 159.329 )
						if( Money_Flow_Ratio <= 0.050358 )
							ret := -0.750000 // sell
						if( Money_Flow_Ratio > 0.050358 )
							ret := -1.000000 // sell
					if( Typical_Price > 159.329 )
						if( Positive_Money_Flow_Sum <= 3.27428e+06 )
							ret := -0.090909
						if( Positive_Money_Flow_Sum > 3.27428e+06 )
							ret := -0.600000
		if( Positive_Money_Flow_Sum > 4.22707e+06 )
			if( Typical_Price <= 119.469 )
				if( Negative_Money_Flow_Sum <= 6.38066e+07 )
					if( Money_Flow_Ratio <= 0.596521 )
						if( Typical_Price <= 116.425 )
							if( Typical_Price <= 110.093 )
								ret := 1.000000 // buy
							if( Typical_Price > 110.093 )
								ret := 0.941176 // buy
						if( Typical_Price > 116.425 )
							ret := 0.666667
					if( Money_Flow_Ratio > 0.596521 )
						ret := 1.000000 // buy
				if( Negative_Money_Flow_Sum > 6.38066e+07 )
					ret := 0.090909
			if( Typical_Price > 119.469 )
				if( MFI <= 29.5554 )
					if( Money_Flow_Ratio <= 0.257569 )
						if( MFI_Low <= -3.7552 )
							if( Raw_Money_Flow <= 1.45035e+07 )
								if( Raw_Money_Flow <= 1.25979e+07 )
									ret := 0.687500
								if( Raw_Money_Flow > 1.25979e+07 )
									ret := 0.957447 // buy
							if( Raw_Money_Flow > 1.45035e+07 )
								if( Negative_Money_Flow_Sum <= 6.01013e+07 )
									ret := -0.064815
								if( Negative_Money_Flow_Sum > 6.01013e+07 )
									ret := 0.293506
						if( MFI_Low > -3.7552 )
							if( MFI_High <= -62.373 )
								if( Negative_Money_Flow_Sum <= 5.26199e+07 )
									ret := -0.591837
								if( Negative_Money_Flow_Sum > 5.26199e+07 )
									ret := -0.084746
							if( MFI_High > -62.373 )
								if( Positive_Money_Flow_Sum <= 1.25462e+07 )
									ret := -0.247863
								if( Positive_Money_Flow_Sum > 1.25462e+07 )
									ret := 0.402778
					if( Money_Flow_Ratio > 0.257569 )
						if( Typical_Price <= 194.934 )
							if( Raw_Money_Flow <= 1.83245e+07 )
								if( Typical_Price <= 169.42 )
									ret := 0.293948
								if( Typical_Price > 169.42 )
									ret := 0.679487
							if( Raw_Money_Flow > 1.83245e+07 )
								if( Negative_Money_Flow_Sum <= 3.38149e+07 )
									ret := -1.000000 // sell
								if( Negative_Money_Flow_Sum > 3.38149e+07 )
									ret := 0.084507
						if( Typical_Price > 194.934 )
							if( Negative_Money_Flow <= 1.46281e+07 )
								ret := -0.111111
							if( Negative_Money_Flow > 1.46281e+07 )
								if( MFI_Low <= 2.17372 )
									ret := 0.933333 // buy
								if( MFI_Low > 2.17372 )
									ret := 0.693333
				if( MFI > 29.5554 )
					if( MFI_Low <= 29.543 )
						if( Money_Flow_Ratio <= 0.873695 )
							if( Raw_Money_Flow <= 2.48688e+07 )
								if( MFI_Low <= 14.4816 )
									ret := -0.272727
								if( MFI_Low > 14.4816 )
									ret := 0.011745
							if( Raw_Money_Flow > 2.48688e+07 )
								if( Negative_Money_Flow_Sum <= 4.87423e+07 )
									ret := 0.648148
								if( Negative_Money_Flow_Sum > 4.87423e+07 )
									ret := 0.111801
						if( Money_Flow_Ratio > 0.873695 )
							if( MFI_High <= -32.0253 )
								if( Negative_Money_Flow_Sum <= 5.8022e+07 )
									ret := -0.883333 // sell
								if( Negative_Money_Flow_Sum > 5.8022e+07 )
									ret := -0.600000
							if( MFI_High > -32.0253 )
								if( Raw_Money_Flow <= 1.30173e+07 )
									ret := -0.866667 // sell
								if( Raw_Money_Flow > 1.30173e+07 )
									ret := 0.185185
					if( MFI_Low > 29.543 )
						if( Positive_Money_Flow_Sum <= 1.36796e+08 )
							if( MFI <= 61.851 )
								if( Money_Flow_Ratio <= 1.32781 )
									ret := 0.320423
								if( Money_Flow_Ratio > 1.32781 )
									ret := -0.107143
							if( MFI > 61.851 )
								if( MFI <= 69.9575 )
									ret := 0.697917
								if( MFI > 69.9575 )
									ret := 0.272727
						if( Positive_Money_Flow_Sum > 1.36796e+08 )
							if( Negative_Money_Flow_Sum <= 1.48865e+08 )
								if( Raw_Money_Flow <= 1.80684e+07 )
									ret := -0.750000 // sell
								if( Raw_Money_Flow > 1.80684e+07 )
									ret := -0.944444 // sell
							if( Negative_Money_Flow_Sum > 1.48865e+08 )
								ret := 0.294118
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_FFIV_15Min_e3de1695(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price)

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


