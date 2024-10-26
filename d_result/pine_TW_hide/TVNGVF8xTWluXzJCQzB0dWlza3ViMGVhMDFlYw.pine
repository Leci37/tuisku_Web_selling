//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: MSFT_1Min_2BC0_b0ea01ec Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BC0_b0ea01ec", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_b0ea01ec(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( bbp <= 0.641591 )
		if( bullPower <= -0.487667 )
			if( ad <= 5260.19 )
				if( mf <= -0.113801 )
					if( ad_mf <= 0.314297 )
						if( bbp <= -1.34667 )
							if( ad_mf <= -104344 )
								if( ad_mf <= -192235 )
									ret := -0.125000
								if( ad_mf > -192235 )
									ret := 0.602740
							if( ad_mf > -104344 )
								if( bbp <= -3.92212 )
									ret := -0.558824
								if( bbp > -3.92212 )
									ret := -0.033045
						if( bbp > -1.34667 )
							if( ad_mf <= 0.169517 )
								if( bearPower <= -0.584083 )
									ret := 0.229167
								if( bearPower > -0.584083 )
									ret := 0.625000
							if( ad_mf > 0.169517 )
								if( mf <= -0.195265 )
									ret := 0.098592
								if( mf > -0.195265 )
									ret := -0.480000
					if( ad_mf > 0.314297 )
						if( bearPower <= -0.518881 )
							if( bullPower <= -0.70491 )
								if( bbm <= 0.694516 )
									ret := 0.577640
								if( bbm > 0.694516 )
									ret := -0.071429
							if( bullPower > -0.70491 )
								if( bullPower <= -0.697376 )
									ret := -0.750000 // sell
								if( bullPower > -0.697376 )
									ret := 0.223301
						if( bearPower > -0.518881 )
							if( mf <= -0.376503 )
								ret := 0.888889 // buy
							if( mf > -0.376503 )
								if( bearPower <= -0.49376 )
									ret := 0.875000 // buy
								if( bearPower > -0.49376 )
									ret := 1.000000 // buy
				if( mf > -0.113801 )
					if( mf <= 0.146342 )
						if( mf <= -0.097145 )
							if( mf <= -0.113025 )
								ret := 1.000000 // buy
							if( mf > -0.113025 )
								if( mf <= -0.109232 )
									ret := 0.172414
								if( mf > -0.109232 )
									ret := 0.675676
						if( mf > -0.097145 )
							if( ad <= -798.69 )
								if( bearPower <= -2.81092 )
									ret := 0.818182 // buy
								if( bearPower > -2.81092 )
									ret := -0.007663
							if( ad > -798.69 )
								if( bearPower <= -0.915725 )
									ret := 0.213333
								if( bearPower > -0.915725 )
									ret := 0.445983
					if( mf > 0.146342 )
						if( ad_mf <= -17.5991 )
							if( bbp <= -1.76624 )
								if( bbm <= 0.525 )
									ret := 0.166667
								if( bbm > 0.525 )
									ret := 0.928571 // buy
							if( bbp > -1.76624 )
								if( bullPower <= -0.545993 )
									ret := -0.433333
								if( bullPower > -0.545993 )
									ret := 0.227273
						if( ad_mf > -17.5991 )
							if( mf <= 0.235975 )
								if( bbp <= -1.32193 )
									ret := 0.721519 // buy
								if( bbp > -1.32193 )
									ret := 0.890625 // buy
							if( mf > 0.235975 )
								if( ad <= 1946.49 )
									ret := 0.641026
								if( ad > 1946.49 )
									ret := -0.142857
			if( ad > 5260.19 )
				if( bbm <= 1.83713 )
					if( bullPower <= -0.536978 )
						if( bullPower <= -0.621469 )
							if( bearPower <= -1.34028 )
								if( ad <= 74397.2 )
									ret := -0.331707
								if( ad > 74397.2 )
									ret := 0.229167
							if( bearPower > -1.34028 )
								if( bearPower <= -1.28579 )
									ret := 0.517241
								if( bearPower > -1.28579 )
									ret := -0.012821
						if( bullPower > -0.621469 )
							if( bbp <= -1.56464 )
								if( bbp <= -2.26366 )
									ret := 0.250000
								if( bbp > -2.26366 )
									ret := -0.506329
							if( bbp > -1.56464 )
								if( bearPower <= -0.929583 )
									ret := 0.185185
								if( bearPower > -0.929583 )
									ret := -0.355932
					if( bullPower > -0.536978 )
						if( bullPower <= -0.497371 )
							if( bearPower <= -0.831482 )
								if( bullPower <= -0.504916 )
									ret := 0.287671
								if( bullPower > -0.504916 )
									ret := 0.692308
							if( bearPower > -0.831482 )
								if( bearPower <= -0.763495 )
									ret := -0.764706 // sell
								if( bearPower > -0.763495 )
									ret := 0.000000
						if( bullPower > -0.497371 )
							if( bbp <= -1.60264 )
								ret := 0.333333
							if( bbp > -1.60264 )
								ret := -0.769231 // sell
				if( bbm > 1.83713 )
					if( bullPower <= -5.39581 )
						ret := 0.666667
					if( bullPower > -5.39581 )
						ret := 1.000000 // buy
		if( bullPower > -0.487667 )
			if( bearPower <= -0.205094 )
				if( ad_mf <= 736.007 )
					if( bullPower <= 0.121892 )
						if( ad_mf <= -1778.7 )
							if( bullPower <= -0.199907 )
								if( ad <= -1910.25 )
									ret := -0.050676
								if( ad > -1910.25 )
									ret := -0.690909
							if( bullPower > -0.199907 )
								if( bbm <= 0.36822 )
									ret := 0.006873
								if( bbm > 0.36822 )
									ret := 0.112465
						if( ad_mf > -1778.7 )
							if( bearPower <= -0.410449 )
								if( bbm <= 0.585295 )
									ret := 0.238057
								if( bbm > 0.585295 )
									ret := -0.030000
							if( bearPower > -0.410449 )
								if( bearPower <= -0.408429 )
									ret := -0.636364
								if( bearPower > -0.408429 )
									ret := 0.109687
					if( bullPower > 0.121892 )
						if( ad <= -9065.35 )
							if( bullPower <= 0.124429 )
								if( bearPower <= -0.428724 )
									ret := 0.750000 // buy
								if( bearPower > -0.428724 )
									ret := 1.000000 // buy
							if( bullPower > 0.124429 )
								if( bbp <= -0.459915 )
									ret := 0.410494
								if( bbp > -0.459915 )
									ret := 0.045890
						if( ad > -9065.35 )
							if( bearPower <= -0.24743 )
								if( bbm <= 1.18062 )
									ret := 0.408320
								if( bbm > 1.18062 )
									ret := 0.713115 // buy
							if( bearPower > -0.24743 )
								if( ad_mf <= -1241.33 )
									ret := 0.125000
								if( ad_mf > -1241.33 )
									ret := -0.516129
				if( ad_mf > 736.007 )
					if( bbp <= 0.327492 )
						if( bullPower <= 0.58434 )
							if( bullPower <= 0.108394 )
								if( bearPower <= -0.215282 )
									ret := -0.014098
								if( bearPower > -0.215282 )
									ret := 0.152249
							if( bullPower > 0.108394 )
								if( BBPower_Color <= 0.5 )
									ret := -0.128253
								if( BBPower_Color > 0.5 )
									ret := 0.087121
						if( bullPower > 0.58434 )
							if( bearPower <= -1.45284 )
								if( ad <= 51313.3 )
									ret := -0.966667 // sell
								if( ad > 51313.3 )
									ret := -0.176471
							if( bearPower > -1.45284 )
								if( ad_mf <= 27649.4 )
									ret := -0.794872 // sell
								if( ad_mf > 27649.4 )
									ret := -0.053763
					if( bbp > 0.327492 )
						if( mf <= 0.334984 )
							if( mf <= -0.075626 )
								if( bullPower <= 0.764779 )
									ret := 0.000000
								if( bullPower > 0.764779 )
									ret := -0.888889 // sell
							if( mf > -0.075626 )
								if( ad <= 10298.3 )
									ret := -1.000000 // sell
								if( ad > 10298.3 )
									ret := -0.583333
						if( mf > 0.334984 )
							if( bullPower <= 0.789346 )
								ret := 0.363636
							if( bullPower > 0.789346 )
								ret := 0.461538
			if( bearPower > -0.205094 )
				if( bullPower <= -0.081118 )
					if( ad_mf <= 0.04169 )
						if( bearPower <= -0.085965 )
							if( ad_mf <= -0.32907 )
								if( mf <= 0.429626 )
									ret := 0.174664
								if( mf > 0.429626 )
									ret := -0.121739
							if( ad_mf > -0.32907 )
								if( ad_mf <= -0.191166 )
									ret := -0.183908
								if( ad_mf > -0.191166 )
									ret := -0.021605
						if( bearPower > -0.085965 )
							if( ad_mf <= -0.38702 )
								ret := -0.266667
							if( ad_mf > -0.38702 )
								if( ad_mf <= -0.036939 )
									ret := 0.552239
								if( ad_mf > -0.036939 )
									ret := 0.000000
					if( ad_mf > 0.04169 )
						if( bullPower <= -0.20224 )
							ret := 0.866667 // buy
						if( bullPower > -0.20224 )
							if( ad_mf <= 0.339833 )
								if( bearPower <= -0.085428 )
									ret := 0.262864
								if( bearPower > -0.085428 )
									ret := -0.257143
							if( ad_mf > 0.339833 )
								if( ad <= 1253.58 )
									ret := 0.000000
								if( ad > 1253.58 )
									ret := 0.151515
				if( bullPower > -0.081118 )
					if( mf <= 0.493973 )
						if( mf <= 0.468741 )
							if( ad <= -44968.4 )
								if( bullPower <= 0.651961 )
									ret := 0.324009
								if( bullPower > 0.651961 )
									ret := -0.333333
							if( ad > -44968.4 )
								if( bearPower <= -0.203573 )
									ret := -0.362963
								if( bearPower > -0.203573 )
									ret := -0.001988
						if( mf > 0.468741 )
							if( bbm <= 0.0047 )
								if( bbp <= 0.110717 )
									ret := 0.352941
								if( bbp > 0.110717 )
									ret := 0.652174
							if( bbm > 0.0047 )
								if( mf <= 0.484137 )
									ret := -0.119048
								if( mf > 0.484137 )
									ret := 0.722222 // buy
					if( mf > 0.493973 )
						if( ad <= 1502.02 )
							if( bbm <= 0.061024 )
								if( BBPower_Color <= 0.5 )
									ret := 0.008734
								if( BBPower_Color > 0.5 )
									ret := -0.163121
							if( bbm > 0.061024 )
								if( bearPower <= -0.171377 )
									ret := -0.777778 // sell
								if( bearPower > -0.171377 )
									ret := -0.159091
						if( ad > 1502.02 )
							if( bearPower <= 0.000611 )
								if( bbp <= 0.077928 )
									ret := -0.423729
								if( bbp > 0.077928 )
									ret := -0.796296 // sell
							if( bearPower > 0.000611 )
								if( ad_mf <= 1673.96 )
									ret := -0.545455
								if( ad_mf > 1673.96 )
									ret := -0.195122
	if( bbp > 0.641591 )
		if( ad <= 15476 )
			if( ad <= -786.859 )
				if( bbm <= 2.92425 )
					if( bbm <= 1.91232 )
						if( bullPower <= 0.456167 )
							if( ad <= -9395.14 )
								if( ad_mf <= -11998.4 )
									ret := 0.182927
								if( ad_mf > -11998.4 )
									ret := 0.540541
							if( ad > -9395.14 )
								if( bbm <= 0.055 )
									ret := -0.190476
								if( bbm > 0.055 )
									ret := 0.048913
						if( bullPower > 0.456167 )
							if( mf <= 0.067572 )
								if( mf <= 0.055666 )
									ret := -0.003642
								if( mf > 0.055666 )
									ret := 0.236559
							if( mf > 0.067572 )
								if( bbm <= 1.00754 )
									ret := -0.122867
								if( bbm > 1.00754 )
									ret := 0.145161
					if( bbm > 1.91232 )
						if( BBPower_Color <= 0.5 )
							if( bullPower <= 1.61885 )
								ret := -0.777778 // sell
							if( bullPower > 1.61885 )
								ret := -1.000000 // sell
						if( BBPower_Color > 0.5 )
							if( ad_mf <= -30015.3 )
								if( bullPower <= 2.11623 )
									ret := -0.400000
								if( bullPower > 2.11623 )
									ret := -0.785714 // sell
							if( ad_mf > -30015.3 )
								if( ad_mf <= -4395.86 )
									ret := 0.250000
								if( ad_mf > -4395.86 )
									ret := 0.636364
				if( bbm > 2.92425 )
					if( bearPower <= -0.164675 )
						if( mf <= -0.133992 )
							ret := 1.000000 // buy
						if( mf > -0.133992 )
							ret := 0.500000
					if( bearPower > -0.164675 )
						ret := -0.235294
			if( ad > -786.859 )
				if( bearPower <= 0.039329 )
					if( ad_mf <= 11533.8 )
						if( mf <= 0.17512 )
							if( bbp <= 0.667871 )
								ret := -0.571429
							if( bbp > 0.667871 )
								if( ad <= 8011.81 )
									ret := -1.000000 // sell
								if( ad > 8011.81 )
									ret := -0.714286 // sell
						if( mf > 0.17512 )
							if( bullPower <= 1.03916 )
								ret := -0.105263
							if( bullPower > 1.03916 )
								if( bullPower <= 2.39816 )
									ret := -0.692308
								if( bullPower > 2.39816 )
									ret := -1.000000 // sell
					if( ad_mf > 11533.8 )
						if( bearPower <= -0.491234 )
							ret := 1.000000 // buy
						if( bearPower > -0.491234 )
							ret := -0.450000
				if( bearPower > 0.039329 )
					if( mf <= -0.392848 )
						if( ad_mf <= 0.425989 )
							if( mf <= -0.594314 )
								ret := -1.000000 // sell
							if( mf > -0.594314 )
								ret := -0.812500 // sell
						if( ad_mf > 0.425989 )
							if( bullPower <= 0.402328 )
								if( bullPower <= 0.356219 )
									ret := -0.578947
								if( bullPower > 0.356219 )
									ret := 0.000000
							if( bullPower > 0.402328 )
								if( ad_mf <= 4696.08 )
									ret := -0.670330
								if( ad_mf > 4696.08 )
									ret := -0.277778
					if( mf > -0.392848 )
						if( bearPower <= 0.760013 )
							if( ad_mf <= 0.284343 )
								if( ad_mf <= 0.170547 )
									ret := -0.250642
								if( ad_mf > 0.170547 )
									ret := -0.666667
							if( ad_mf > 0.284343 )
								if( bbm <= 0.371619 )
									ret := -0.083980
								if( bbm > 0.371619 )
									ret := -0.331337
						if( bearPower > 0.760013 )
							if( bbp <= 1.65729 )
								if( ad_mf <= -0.1242 )
									ret := -0.375000
								if( ad_mf > -0.1242 )
									ret := 0.849057 // buy
							if( bbp > 1.65729 )
								if( bbp <= 3.0316 )
									ret := -0.061444
								if( bbp > 3.0316 )
									ret := -0.422414
		if( ad > 15476 )
			if( ad <= 17087.8 )
				if( ad_mf <= 16572.1 )
					if( ad <= 16423.5 )
						if( bearPower <= 0.203868 )
							if( ad_mf <= 16122.6 )
								ret := 0.636364
							if( ad_mf > 16122.6 )
								ret := -0.812500 // sell
						if( bearPower > 0.203868 )
							if( bbp <= 1.19465 )
								if( bullPower <= 0.515603 )
									ret := 0.465116
								if( bullPower > 0.515603 )
									ret := 0.926829 // buy
							if( bbp > 1.19465 )
								if( bbp <= 1.46855 )
									ret := -0.363636
								if( bbp > 1.46855 )
									ret := 0.272727
					if( ad > 16423.5 )
						ret := -0.736842 // sell
				if( ad_mf > 16572.1 )
					if( bullPower <= 0.916546 )
						if( bbp <= 1.16653 )
							if( ad_mf <= 16920.4 )
								if( ad <= 16845.1 )
									ret := 0.818182 // buy
								if( ad > 16845.1 )
									ret := 0.000000
							if( ad_mf > 16920.4 )
								ret := 1.000000 // buy
						if( bbp > 1.16653 )
							ret := 0.923077 // buy
					if( bullPower > 0.916546 )
						ret := -0.153846
			if( ad > 17087.8 )
				if( ad_mf <= 417650 )
					if( bullPower <= 0.604025 )
						if( ad_mf <= 124544 )
							if( BBPower_Color <= 0.5 )
								if( ad_mf <= 25013 )
									ret := -0.105263
								if( ad_mf > 25013 )
									ret := 0.659574
							if( BBPower_Color > 0.5 )
								if( mf <= -0.046877 )
									ret := 0.517857
								if( mf > -0.046877 )
									ret := 0.086176
						if( ad_mf > 124544 )
							ret := -0.636364
					if( bullPower > 0.604025 )
						if( ad <= 63547.8 )
							if( bullPower <= 1.03961 )
								if( bbm <= 0.97364 )
									ret := -0.058164
								if( bbm > 0.97364 )
									ret := 0.461538
							if( bullPower > 1.03961 )
								if( ad_mf <= 55392 )
									ret := -0.169492
								if( ad_mf > 55392 )
									ret := -0.571429
						if( ad > 63547.8 )
							if( ad_mf <= 110251 )
								if( ad <= 98503.3 )
									ret := 0.165049
								if( ad > 98503.3 )
									ret := 0.867925 // buy
							if( ad_mf > 110251 )
								if( mf <= 0.117354 )
									ret := 0.173913
								if( mf > 0.117354 )
									ret := -0.311558
				if( ad_mf > 417650 )
					if( ad <= 504719 )
						ret := 0.944444 // buy
					if( ad > 504719 )
						if( mf <= 0.508608 )
							ret := -0.166667
						if( mf > 0.508608 )
							ret := 0.600000
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


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
float op_operation = decision_tree_0_MSFT_1Min_b0ea01ec(bearPower, bbm, bbp, bullPower, BBPower_Color, mf, ad_mf, ad)

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


