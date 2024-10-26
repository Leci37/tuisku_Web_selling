//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: VETUSDT_30Min_2BV0_6e4b5945 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2BV0_6e4b5945", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_6e4b5945(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.000519 )
		if( bbp <= -0.011178 )
			if( VIP <= 0.689655 )
				if( bbp <= -0.0169 )
					if( bbp <= -0.042218 )
						if( bbp <= -0.048465 )
							if( VIM <= 1.2106 )
								ret := 1.000000 // buy
							if( VIM > 1.2106 )
								ret := 0.750000 // buy
						if( bbp > -0.048465 )
							ret := 0.250000
					if( bbp > -0.042218 )
						if( VIP <= 0.468139 )
							ret := 0.800000 // buy
						if( VIP > 0.468139 )
							ret := 1.000000 // buy
				if( bbp > -0.0169 )
					if( bbm <= 0.005178 )
						if( VIP <= 0.588859 )
							ret := 0.000000
						if( VIP > 0.588859 )
							if( bbp <= -0.012024 )
								ret := 1.000000 // buy
							if( bbp > -0.012024 )
								ret := 0.750000 // buy
					if( bbm > 0.005178 )
						if( VIP <= 0.665135 )
							if( bbm <= 0.007162 )
								if( VIP_VIM <= -0.679322 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.679322 )
									ret := -0.500000
							if( bbm > 0.007162 )
								if( bbm <= 0.009822 )
									ret := 0.714286 // buy
								if( bbm > 0.009822 )
									ret := -0.250000
						if( VIP > 0.665135 )
							if( VIP_VIM <= -0.570862 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.570862 )
								ret := 0.750000 // buy
			if( VIP > 0.689655 )
				if( VIM <= 1.07218 )
					if( VIP <= 0.94411 )
						if( VIP_VIM <= -0.117242 )
							ret := -1.000000 // sell
						if( VIP_VIM > -0.117242 )
							ret := 1.000000 // buy
					if( VIP > 0.94411 )
						if( bearPower <= -0.012436 )
							ret := 1.000000 // buy
						if( bearPower > -0.012436 )
							ret := -0.400000
				if( VIM > 1.07218 )
					if( VIM <= 1.1666 )
						if( bullPower <= -0.002675 )
							if( VIM <= 1.12999 )
								if( VIP <= 0.942575 )
									ret := -0.038462
								if( VIP > 0.942575 )
									ret := 1.000000 // buy
							if( VIM > 1.12999 )
								if( VIP_VIM <= -0.298843 )
									ret := 0.923077 // buy
								if( VIP_VIM > -0.298843 )
									ret := 0.250000
						if( bullPower > -0.002675 )
							if( VIP <= 0.807638 )
								if( VIP <= 0.785258 )
									ret := 1.000000 // buy
								if( VIP > 0.785258 )
									ret := 0.111111
							if( VIP > 0.807638 )
								if( bbp <= -0.012886 )
									ret := 1.000000 // buy
								if( bbp > -0.012886 )
									ret := 0.857143 // buy
					if( VIM > 1.1666 )
						if( VIM <= 1.18234 )
							if( bullPower <= -0.003132 )
								ret := -1.000000 // sell
							if( bullPower > -0.003132 )
								if( VIM <= 1.1737 )
									ret := -0.500000
								if( VIM > 1.1737 )
									ret := 0.250000
						if( VIM > 1.18234 )
							if( bbm <= 0.007104 )
								if( VIM <= 1.22723 )
									ret := 0.823529 // buy
								if( VIM > 1.22723 )
									ret := 0.148148
							if( bbm > 0.007104 )
								if( VIM <= 1.19725 )
									ret := 0.666667
								if( VIM > 1.19725 )
									ret := -0.160000
		if( bbp > -0.011178 )
			if( VIP <= 1.03802 )
				if( VIP <= 0.883899 )
					if( bbp <= -0.00044 )
						if( VIP <= 0.634702 )
							if( VIM <= 1.21763 )
								if( bullPower <= -0.000456 )
									ret := 0.222222
								if( bullPower > -0.000456 )
									ret := 0.814815 // buy
							if( VIM > 1.21763 )
								if( VIM <= 1.24282 )
									ret := -0.461538
								if( VIM > 1.24282 )
									ret := 0.261682
						if( VIP > 0.634702 )
							if( VIM <= 1.15616 )
								if( bullPower <= 3.7e-05 )
									ret := 0.246324
								if( bullPower > 3.7e-05 )
									ret := 0.063389
							if( VIM > 1.15616 )
								if( VIP <= 0.783673 )
									ret := 0.160973
								if( VIP > 0.783673 )
									ret := 0.049843
					if( bbp > -0.00044 )
						if( bbm <= 0.001098 )
							if( VIP_VIM <= -0.219598 )
								if( VIM <= 1.09667 )
									ret := -0.863636 // sell
								if( VIM > 1.09667 )
									ret := -0.329114
							if( VIP_VIM > -0.219598 )
								if( bullPower <= 0.000219 )
									ret := 1.000000 // buy
								if( bullPower > 0.000219 )
									ret := 0.307692
						if( bbm > 0.001098 )
							if( VIP_VIM <= -0.166288 )
								if( bearPower <= -0.001551 )
									ret := 0.875000 // buy
								if( bearPower > -0.001551 )
									ret := 0.059322
							if( VIP_VIM > -0.166288 )
								if( bearPower <= -0.000616 )
									ret := -0.764706 // sell
								if( bearPower > -0.000616 )
									ret := 1.000000 // buy
				if( VIP > 0.883899 )
					if( VIM <= 0.898401 )
						if( VIP_VIM <= 0.157175 )
							if( VIP_VIM <= 0.124645 )
								if( VIP_VIM <= 0.079054 )
									ret := 0.866667 // buy
								if( VIP_VIM > 0.079054 )
									ret := 0.000000
							if( VIP_VIM > 0.124645 )
								if( bbp <= 0.0024 )
									ret := 0.972973 // buy
								if( bbp > 0.0024 )
									ret := 0.500000
						if( VIP_VIM > 0.157175 )
							if( VIP_VIM <= 0.28063 )
								if( VIP <= 1.03672 )
									ret := -0.588235
								if( VIP > 1.03672 )
									ret := 0.500000
							if( VIP_VIM > 0.28063 )
								ret := 0.800000 // buy
					if( VIM > 0.898401 )
						if( VIP <= 0.890161 )
							if( VIP_VIM <= -0.221393 )
								if( bearPower <= -0.003511 )
									ret := -0.947368 // sell
								if( bearPower > -0.003511 )
									ret := 0.053097
							if( VIP_VIM > -0.221393 )
								if( bearPower <= -0.006365 )
									ret := 1.000000 // buy
								if( bearPower > -0.006365 )
									ret := -0.377907
						if( VIP > 0.890161 )
							if( VIP <= 0.892481 )
								if( VIM <= 1.14268 )
									ret := 0.445122
								if( VIM > 1.14268 )
									ret := -0.181818
							if( VIP > 0.892481 )
								if( VIP <= 1.02327 )
									ret := 0.051710
								if( VIP > 1.02327 )
									ret := -0.125000
			if( VIP > 1.03802 )
				if( bullPower <= 0.000349 )
					if( VIP_VIM <= -0.045308 )
						if( VIM <= 1.12031 )
							ret := -1.000000 // sell
						if( VIM > 1.12031 )
							ret := -0.500000
					if( VIP_VIM > -0.045308 )
						if( bearPower <= -0.001251 )
							if( VIM <= 0.925889 )
								if( VIM <= 0.913806 )
									ret := 0.550000
								if( VIM > 0.913806 )
									ret := -0.533333
							if( VIM > 0.925889 )
								if( bbm <= 0.004917 )
									ret := 0.629310
								if( bbm > 0.004917 )
									ret := -0.444444
						if( bearPower > -0.001251 )
							if( VIM <= 0.908879 )
								if( VIP_VIM <= 0.281378 )
									ret := 0.358209
								if( VIP_VIM > 0.281378 )
									ret := 0.775000 // buy
							if( VIM > 0.908879 )
								if( VIP <= 1.1498 )
									ret := 0.212982
								if( VIP > 1.1498 )
									ret := 0.821429 // buy
				if( bullPower > 0.000349 )
					if( bbm <= 0.00265 )
						if( VIP <= 1.047 )
							if( bbm <= 0.00111 )
								if( VIP_VIM <= 0.084345 )
									ret := 0.833333 // buy
								if( VIP_VIM > 0.084345 )
									ret := -1.000000 // sell
							if( bbm > 0.00111 )
								if( bbp <= -0.000776 )
									ret := 0.300000
								if( bbp > -0.000776 )
									ret := 0.777778 // buy
						if( VIP > 1.047 )
							if( VIP_VIM <= 0.136338 )
								if( VIP_VIM <= 0.128692 )
									ret := 0.070968
								if( VIP_VIM > 0.128692 )
									ret := -0.678571
							if( VIP_VIM > 0.136338 )
								if( VIP_VIM <= 0.230655 )
									ret := 0.371758
								if( VIP_VIM > 0.230655 )
									ret := -0.016949
					if( bbm > 0.00265 )
						if( bullPower <= 0.004956 )
							if( bbp <= -0.001541 )
								if( VIP <= 1.10212 )
									ret := -0.070175
								if( VIP > 1.10212 )
									ret := -0.933333 // sell
							if( bbp > -0.001541 )
								if( VIM <= 0.890706 )
									ret := -0.182857
								if( VIM > 0.890706 )
									ret := 0.133333
						if( bullPower > 0.004956 )
							if( VIP_VIM <= 0.201973 )
								ret := 1.000000 // buy
							if( VIP_VIM > 0.201973 )
								if( bearPower <= -0.000961 )
									ret := 0.608696
								if( bearPower > -0.000961 )
									ret := -0.400000
	if( bearPower > -0.000519 )
		if( bearPower <= 0.002361 )
			if( VIP_VIM <= 0.521075 )
				if( VIP <= 1.25 )
					if( bbm <= 0.000171 )
						if( bullPower <= 0.000127 )
							if( VIM <= 1.34427 )
								if( VIP <= 0.815877 )
									ret := 0.030551
								if( VIP > 0.815877 )
									ret := -0.014535
							if( VIM > 1.34427 )
								if( VIP <= 0.630178 )
									ret := 0.050000
								if( VIP > 0.630178 )
									ret := -0.453333
						if( bullPower > 0.000127 )
							if( bearPower <= 0.000355 )
								if( VIP <= 1.09339 )
									ret := 0.097985
								if( VIP > 1.09339 )
									ret := 0.004575
							if( bearPower > 0.000355 )
								if( VIM <= 0.771949 )
									ret := -1.000000 // sell
								if( VIM > 0.771949 )
									ret := -0.250000
					if( bbm > 0.000171 )
						if( bearPower <= 3.7e-05 )
							if( VIP_VIM <= 0.443617 )
								if( bearPower <= -2.2e-05 )
									ret := 0.040225
								if( bearPower > -2.2e-05 )
									ret := 0.109066
							if( VIP_VIM > 0.443617 )
								if( VIM <= 0.765725 )
									ret := 0.303030
								if( VIM > 0.765725 )
									ret := 0.648649
						if( bearPower > 3.7e-05 )
							if( VIM <= 0.772052 )
								if( VIP_VIM <= 0.447258 )
									ret := 0.318182
								if( VIP_VIM > 0.447258 )
									ret := -0.020117
							if( VIM > 0.772052 )
								if( VIM <= 1.07846 )
									ret := -0.002686
								if( VIM > 1.07846 )
									ret := 0.222772
				if( VIP > 1.25 )
					if( bbp <= 4.6e-05 )
						if( bullPower <= 6.3e-05 )
							if( VIP_VIM <= 0.348476 )
								if( bbp <= 2.2e-05 )
									ret := 0.200000
								if( bbp > 2.2e-05 )
									ret := 0.750000 // buy
							if( VIP_VIM > 0.348476 )
								ret := 0.000000
						if( bullPower > 6.3e-05 )
							if( bearPower <= -0.000151 )
								ret := 1.000000 // buy
							if( bearPower > -0.000151 )
								ret := 0.750000 // buy
					if( bbp > 4.6e-05 )
						if( VIP <= 1.25448 )
							if( bearPower <= 0.000243 )
								if( VIP_VIM <= 0.476091 )
									ret := -0.212766
								if( VIP_VIM > 0.476091 )
									ret := 0.264706
							if( bearPower > 0.000243 )
								if( bullPower <= 0.003247 )
									ret := -0.629213
								if( bullPower > 0.003247 )
									ret := 0.285714
						if( VIP > 1.25448 )
							if( VIM <= 0.92194 )
								if( VIM <= 0.739629 )
									ret := 0.666667
								if( VIM > 0.739629 )
									ret := -0.088919
							if( VIM > 0.92194 )
								if( bullPower <= 0.000197 )
									ret := 0.000000
								if( bullPower > 0.000197 )
									ret := -0.695652
			if( VIP_VIM > 0.521075 )
				if( VIP_VIM <= 0.980182 )
					if( VIM <= 0.597505 )
						if( bearPower <= 0.001751 )
							if( bbm <= 0.000785 )
								if( VIM <= 0.589094 )
									ret := 0.051402
								if( VIM > 0.589094 )
									ret := -0.333333
							if( bbm > 0.000785 )
								if( VIP_VIM <= 0.850289 )
									ret := -0.468750
								if( VIP_VIM > 0.850289 )
									ret := 0.095238
						if( bearPower > 0.001751 )
							if( VIP <= 1.38274 )
								if( VIP_VIM <= 0.812117 )
									ret := 0.333333
								if( VIP_VIM > 0.812117 )
									ret := 1.000000 // buy
							if( VIP > 1.38274 )
								if( bbp <= 0.005381 )
									ret := 0.428571
								if( bbp > 0.005381 )
									ret := -0.800000 // sell
					if( VIM > 0.597505 )
						if( VIP_VIM <= 0.741654 )
							if( bbm <= 0.001736 )
								if( bearPower <= 0.001282 )
									ret := 0.079424
								if( bearPower > 0.001282 )
									ret := -0.191781
							if( bbm > 0.001736 )
								if( bearPower <= 7.4e-05 )
									ret := -0.750000 // sell
								if( bearPower > 7.4e-05 )
									ret := 0.273438
						if( VIP_VIM > 0.741654 )
							if( bbm <= 0.000314 )
								if( VIP <= 1.36184 )
									ret := 0.750000 // buy
								if( VIP > 1.36184 )
									ret := 0.171171
							if( bbm > 0.000314 )
								if( bbp <= 0.004932 )
									ret := 0.726190 // buy
								if( bbp > 0.004932 )
									ret := 0.083333
				if( VIP_VIM > 0.980182 )
					if( bullPower <= 0.000844 )
						ret := 0.333333
					if( bullPower > 0.000844 )
						if( bbp <= 0.001525 )
							ret := 1.000000 // buy
						if( bbp > 0.001525 )
							ret := 0.714286 // buy
		if( bearPower > 0.002361 )
			if( VIM <= 0.767559 )
				if( bullPower <= 0.015158 )
					if( VIM <= 0.754615 )
						if( VIP_VIM <= 0.938468 )
							if( VIP <= 1.38206 )
								if( bearPower <= 0.005806 )
									ret := -0.116883
								if( bearPower > 0.005806 )
									ret := 0.666667
							if( VIP > 1.38206 )
								if( bearPower <= 0.003787 )
									ret := -1.000000 // sell
								if( bearPower > 0.003787 )
									ret := -0.571429
						if( VIP_VIM > 0.938468 )
							ret := 1.000000 // buy
					if( VIM > 0.754615 )
						if( VIM <= 0.76215 )
							if( bullPower <= 0.005784 )
								ret := 0.750000 // buy
							if( bullPower > 0.005784 )
								ret := 1.000000 // buy
						if( VIM > 0.76215 )
							ret := 0.500000
				if( bullPower > 0.015158 )
					if( bearPower <= 0.008872 )
						if( VIP <= 1.29894 )
							if( bullPower <= 0.021006 )
								ret := -1.000000 // sell
							if( bullPower > 0.021006 )
								ret := -0.500000
						if( VIP > 1.29894 )
							ret := 0.000000
					if( bearPower > 0.008872 )
						if( bbm <= 0.010091 )
							ret := 0.600000
						if( bbm > 0.010091 )
							if( VIP_VIM <= 0.615312 )
								ret := 0.250000
							if( VIP_VIM > 0.615312 )
								ret := -1.000000 // sell
			if( VIM > 0.767559 )
				if( VIP <= 1.18339 )
					if( VIM <= 0.826388 )
						if( bearPower <= 0.002885 )
							if( bbp <= 0.009867 )
								ret := 1.000000 // buy
							if( bbp > 0.009867 )
								ret := 0.500000
						if( bearPower > 0.002885 )
							if( bbm <= 0.007647 )
								ret := 0.000000
							if( bbm > 0.007647 )
								ret := 0.600000
					if( VIM > 0.826388 )
						if( VIM <= 0.887332 )
							if( bbp <= 0.008192 )
								if( bbp <= 0.007411 )
									ret := -0.500000
								if( bbp > 0.007411 )
									ret := 0.250000
							if( bbp > 0.008192 )
								if( bbm <= 0.009424 )
									ret := -0.914286 // sell
								if( bbm > 0.009424 )
									ret := -0.250000
						if( VIM > 0.887332 )
							if( VIP_VIM <= 0.198975 )
								if( VIP_VIM <= 0.167478 )
									ret := -0.066667
								if( VIP_VIM > 0.167478 )
									ret := -0.833333 // sell
							if( VIP_VIM > 0.198975 )
								if( bullPower <= 0.007966 )
									ret := 0.666667
								if( bullPower > 0.007966 )
									ret := 1.000000 // buy
				if( VIP > 1.18339 )
					if( bearPower <= 0.002511 )
						if( VIM <= 0.784357 )
							ret := -0.666667
						if( VIM > 0.784357 )
							ret := 0.285714
					if( bearPower > 0.002511 )
						if( bbm <= 0.00637 )
							if( bearPower <= 0.003094 )
								if( bullPower <= 0.005716 )
									ret := -0.937500 // sell
								if( bullPower > 0.005716 )
									ret := -0.090909
							if( bearPower > 0.003094 )
								if( VIM <= 0.777062 )
									ret := -0.923077 // sell
								if( VIM > 0.777062 )
									ret := -1.000000 // sell
						if( bbm > 0.00637 )
							if( VIP <= 1.20351 )
								if( bbm <= 0.011226 )
									ret := -0.750000 // sell
								if( bbm > 0.011226 )
									ret := -1.000000 // sell
							if( VIP > 1.20351 )
								if( bearPower <= 0.006413 )
									ret := 1.000000 // buy
								if( bearPower > 0.006413 )
									ret := -0.444444
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_VETUSDT_30Min_6e4b5945(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP_VIM, VIP, VIM)

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


