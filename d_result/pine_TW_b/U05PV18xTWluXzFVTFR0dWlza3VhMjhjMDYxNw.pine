//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Ultimate_MA_MTF_V2
// ID_model: SNOW_1Min_1ULT_a28c0617 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_1ULT_a28c0617", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_a28c0617(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( avg <= 109.81 )
		if( avg2 <= 108.032 )
			if( cr_upInt <= 0.5 )
				if( avg2 <= 107.654 )
					if( avg2 <= 107.564 )
						if( avg <= 107.432 )
							ret := 0.500000
						if( avg > 107.432 )
							if( avg2 <= 107.548 )
								ret := 1.000000 // buy
							if( avg2 > 107.548 )
								ret := 0.500000
					if( avg2 > 107.564 )
						if( ma_downInt <= 0.5 )
							if( avg <= 107.805 )
								ret := 1.000000 // buy
							if( avg > 107.805 )
								ret := 0.750000 // buy
						if( ma_downInt > 0.5 )
							ret := 1.000000 // buy
				if( avg2 > 107.654 )
					if( avg <= 108.371 )
						if( avg <= 107.91 )
							if( ma_upInt <= 0.5 )
								if( avg <= 107.648 )
									ret := 0.281250
								if( avg > 107.648 )
									ret := 0.869565 // buy
							if( ma_upInt > 0.5 )
								if( avg2 <= 107.866 )
									ret := 0.625000
								if( avg2 > 107.866 )
									ret := -0.857143 // sell
						if( avg > 107.91 )
							if( avg2 <= 107.766 )
								ret := -0.800000 // sell
							if( avg2 > 107.766 )
								if( avg <= 108.23 )
									ret := 0.400000
								if( avg > 108.23 )
									ret := 0.076923
					if( avg > 108.371 )
						ret := 1.000000 // buy
			if( cr_upInt > 0.5 )
				if( ma_upInt <= 0.5 )
					ret := 0.000000
				if( ma_upInt > 0.5 )
					ret := 0.200000
		if( avg2 > 108.032 )
			if( avg <= 109.409 )
				if( avg2 <= 108.349 )
					if( ma_downInt <= 0.5 )
						if( avg2 <= 108.288 )
							if( avg <= 108.604 )
								if( avg2 <= 108.164 )
									ret := 0.000000
								if( avg2 > 108.164 )
									ret := -0.750000 // sell
							if( avg > 108.604 )
								if( avg <= 108.811 )
									ret := -0.916667 // sell
								if( avg > 108.811 )
									ret := -0.250000
						if( avg2 > 108.288 )
							ret := 0.000000
					if( ma_downInt > 0.5 )
						if( avg <= 108.04 )
							if( avg2 <= 108.216 )
								if( avg2 <= 108.058 )
									ret := -0.750000 // sell
								if( avg2 > 108.058 )
									ret := -0.166667
							if( avg2 > 108.216 )
								if( avg2 <= 108.276 )
									ret := 0.888889 // buy
								if( avg2 > 108.276 )
									ret := 0.000000
						if( avg > 108.04 )
							if( avg <= 108.322 )
								if( avg <= 108.164 )
									ret := -0.375000
								if( avg > 108.164 )
									ret := -0.794118 // sell
							if( avg > 108.322 )
								ret := 0.250000
				if( avg2 > 108.349 )
					if( avg <= 108.377 )
						if( avg2 <= 108.667 )
							if( avg <= 108.319 )
								if( avg <= 108.287 )
									ret := 0.111111
								if( avg > 108.287 )
									ret := -0.428571
							if( avg > 108.319 )
								ret := 0.333333
						if( avg2 > 108.667 )
							if( avg2 <= 109.048 )
								if( avg <= 108.31 )
									ret := 1.000000 // buy
								if( avg > 108.31 )
									ret := 0.785714 // buy
							if( avg2 > 109.048 )
								if( avg2 <= 109.102 )
									ret := 0.000000
								if( avg2 > 109.102 )
									ret := 0.812500 // buy
					if( avg > 108.377 )
						if( avg2 <= 109.867 )
							if( avg2 <= 108.486 )
								if( avg2 <= 108.456 )
									ret := 0.840000 // buy
								if( avg2 > 108.456 )
									ret := 0.500000
							if( avg2 > 108.486 )
								if( ma_downInt <= 0.5 )
									ret := 0.300847
								if( ma_downInt > 0.5 )
									ret := 0.000000
						if( avg2 > 109.867 )
							if( avg2 <= 110.076 )
								if( avg <= 109.361 )
									ret := -1.000000 // sell
								if( avg > 109.361 )
									ret := -0.875000 // sell
							if( avg2 > 110.076 )
								if( avg <= 109.372 )
									ret := 0.000000
								if( avg > 109.372 )
									ret := 1.000000 // buy
			if( avg > 109.409 )
				if( ma_downInt <= 0.5 )
					if( avg2 <= 109.699 )
						if( avg2 <= 109.545 )
							if( avg2 <= 109.384 )
								if( avg <= 109.428 )
									ret := -0.333333
								if( avg > 109.428 )
									ret := 0.372881
							if( avg2 > 109.384 )
								if( avg <= 109.558 )
									ret := -0.282051
								if( avg > 109.558 )
									ret := 0.319149
						if( avg2 > 109.545 )
							if( avg <= 109.78 )
								if( cr_down2Int <= 0.5 )
									ret := 0.404762
								if( cr_down2Int > 0.5 )
									ret := 0.555556
							if( avg > 109.78 )
								if( avg <= 109.803 )
									ret := -0.250000
								if( avg > 109.803 )
									ret := -0.250000
					if( avg2 > 109.699 )
						if( cr_down2Int <= 0.5 )
							if( avg2 <= 109.707 )
								if( avg <= 109.67 )
									ret := -1.000000 // sell
								if( avg > 109.67 )
									ret := -0.714286 // sell
							if( avg2 > 109.707 )
								if( cr_upInt <= 0.5 )
									ret := -0.156863
								if( cr_upInt > 0.5 )
									ret := 0.714286 // buy
						if( cr_down2Int > 0.5 )
							if( avg <= 109.691 )
								ret := 1.000000 // buy
							if( avg > 109.691 )
								ret := 0.166667
				if( ma_downInt > 0.5 )
					if( avg2 <= 110.245 )
						if( avg2 <= 109.757 )
							if( avg <= 109.418 )
								if( avg2 <= 109.601 )
									ret := 0.750000 // buy
								if( avg2 > 109.601 )
									ret := 1.000000 // buy
							if( avg > 109.418 )
								if( avg <= 109.474 )
									ret := 0.333333
								if( avg > 109.474 )
									ret := 0.610860
						if( avg2 > 109.757 )
							if( avg <= 109.757 )
								if( avg2 <= 110.155 )
									ret := -0.047244
								if( avg2 > 110.155 )
									ret := 0.777778 // buy
							if( avg > 109.757 )
								if( avg <= 109.805 )
									ret := 0.576471
								if( avg > 109.805 )
									ret := 0.363636
					if( avg2 > 110.245 )
						if( avg2 <= 110.296 )
							ret := -1.000000 // sell
						if( avg2 > 110.296 )
							if( avg <= 109.604 )
								ret := 0.750000 // buy
							if( avg > 109.604 )
								if( avg <= 109.76 )
									ret := -0.875000 // sell
								if( avg > 109.76 )
									ret := -0.714286 // sell
	if( avg > 109.81 )
		if( avg <= 164.616 )
			if( avg2 <= 160.531 )
				if( cr_downInt <= 0.5 )
					if( avg <= 130.5 )
						if( avg2 <= 128.774 )
							if( cr_upInt <= 0.5 )
								if( avg2 <= 109.141 )
									ret := -0.821429 // sell
								if( avg2 > 109.141 )
									ret := 0.055103
							if( cr_upInt > 0.5 )
								if( avg2 <= 111.594 )
									ret := 0.216814
								if( avg2 > 111.594 )
									ret := -0.085517
						if( avg2 > 128.774 )
							if( cr_down2Int <= 0.5 )
								if( avg <= 127.802 )
									ret := 0.685714
								if( avg > 127.802 )
									ret := 0.130170
							if( cr_down2Int > 0.5 )
								if( ma_downInt <= 0.5 )
									ret := -0.580645
								if( ma_downInt > 0.5 )
									ret := 0.454545
					if( avg > 130.5 )
						if( cr_upInt <= 0.5 )
							if( avg <= 130.903 )
								if( avg2 <= 130.823 )
									ret := -0.002053
								if( avg2 > 130.823 )
									ret := -0.292453
							if( avg > 130.903 )
								if( ma_upInt <= 0.5 )
									ret := 0.024979
								if( ma_upInt > 0.5 )
									ret := 0.005742
						if( cr_upInt > 0.5 )
							if( avg <= 131.475 )
								if( avg2 <= 131.639 )
									ret := -0.441441
								if( avg2 > 131.639 )
									ret := 0.166667
							if( avg > 131.475 )
								if( avg2 <= 135.295 )
									ret := -0.003030
								if( avg2 > 135.295 )
									ret := -0.139447
				if( cr_downInt > 0.5 )
					if( avg <= 129.2 )
						if( avg2 <= 128.889 )
							if( avg <= 125.669 )
								if( avg2 <= 111.619 )
									ret := 0.210145
								if( avg2 > 111.619 )
									ret := 0.001787
							if( avg > 125.669 )
								if( avg <= 126.349 )
									ret := 0.452381
								if( avg > 126.349 )
									ret := 0.106936
						if( avg2 > 128.889 )
							if( ma_upInt <= 0.5 )
								if( avg2 <= 129.258 )
									ret := -0.600000
								if( avg2 > 129.258 )
									ret := -0.250000
							if( ma_upInt > 0.5 )
								ret := -1.000000 // sell
					if( avg > 129.2 )
						if( avg2 <= 159.946 )
							if( avg <= 129.302 )
								if( avg <= 129.235 )
									ret := 0.600000
								if( avg > 129.235 )
									ret := 1.000000 // buy
							if( avg > 129.302 )
								if( ma_upInt <= 0.5 )
									ret := 0.313235
								if( ma_upInt > 0.5 )
									ret := 0.197279
						if( avg2 > 159.946 )
							if( avg2 <= 160.203 )
								if( ma_downInt <= 0.5 )
									ret := 0.000000
								if( ma_downInt > 0.5 )
									ret := -0.785714 // sell
							if( avg2 > 160.203 )
								if( avg2 <= 160.438 )
									ret := 0.250000
								if( avg2 > 160.438 )
									ret := -0.333333
			if( avg2 > 160.531 )
				if( ma_downInt <= 0.5 )
					if( avg <= 163.332 )
						if( avg <= 161.987 )
							if( avg <= 161.385 )
								if( avg <= 161.225 )
									ret := 0.120930
								if( avg > 161.225 )
									ret := 0.578125
							if( avg > 161.385 )
								if( avg2 <= 161.255 )
									ret := -0.634146
								if( avg2 > 161.255 )
									ret := 0.082840
						if( avg > 161.987 )
							if( cr_downInt <= 0.5 )
								if( avg2 <= 163.006 )
									ret := 0.163743
								if( avg2 > 163.006 )
									ret := 0.522124
							if( cr_downInt > 0.5 )
								if( avg2 <= 162.184 )
									ret := 0.000000
								if( avg2 > 162.184 )
									ret := 0.785714 // buy
					if( avg > 163.332 )
						if( avg2 <= 163.703 )
							if( avg2 <= 162.935 )
								if( avg2 <= 162.889 )
									ret := 1.000000 // buy
								if( avg2 > 162.889 )
									ret := 0.600000
							if( avg2 > 162.935 )
								if( cr_down2Int <= 0.5 )
									ret := -0.319588
								if( cr_down2Int > 0.5 )
									ret := 0.200000
						if( avg2 > 163.703 )
							if( avg <= 163.674 )
								if( avg <= 163.542 )
									ret := -1.000000 // sell
								if( avg > 163.542 )
									ret := -0.363636
							if( avg > 163.674 )
								if( avg <= 164.235 )
									ret := 0.248000
								if( avg > 164.235 )
									ret := 0.072464
				if( ma_downInt > 0.5 )
					if( avg2 <= 164.439 )
						if( avg <= 160.303 )
							if( avg2 <= 160.646 )
								if( avg2 <= 160.567 )
									ret := 0.250000
								if( avg2 > 160.567 )
									ret := 1.000000 // buy
							if( avg2 > 160.646 )
								if( avg <= 159.99 )
									ret := 0.696429
								if( avg > 159.99 )
									ret := -0.400000
						if( avg > 160.303 )
							if( avg <= 161.34 )
								if( avg <= 161.038 )
									ret := 0.025381
								if( avg > 161.038 )
									ret := -0.342466
							if( avg > 161.34 )
								if( avg <= 164.262 )
									ret := 0.289157
								if( avg > 164.262 )
									ret := -0.085106
					if( avg2 > 164.439 )
						if( avg <= 164.398 )
							if( avg2 <= 166.859 )
								if( avg <= 164.179 )
									ret := -0.725000 // sell
								if( avg > 164.179 )
									ret := -0.200000
							if( avg2 > 166.859 )
								ret := 1.000000 // buy
						if( avg > 164.398 )
							if( avg2 <= 164.576 )
								if( avg <= 164.553 )
									ret := 0.648148
								if( avg > 164.553 )
									ret := 0.000000
							if( avg2 > 164.576 )
								if( cr_upInt <= 0.5 )
									ret := 0.156863
								if( cr_upInt > 0.5 )
									ret := 0.000000
		if( avg > 164.616 )
			if( avg2 <= 169.315 )
				if( avg2 <= 165.471 )
					if( avg <= 164.686 )
						if( cr_downInt <= 0.5 )
							if( avg2 <= 164.758 )
								if( avg <= 164.62 )
									ret := -1.000000 // sell
								if( avg > 164.62 )
									ret := -0.540230
							if( avg2 > 164.758 )
								if( avg <= 164.634 )
									ret := 0.750000 // buy
								if( avg > 164.634 )
									ret := -0.400000
						if( cr_downInt > 0.5 )
							ret := -0.714286 // sell
					if( avg > 164.686 )
						if( ma_upInt <= 0.5 )
							if( avg2 <= 164.665 )
								if( avg2 <= 164.548 )
									ret := -0.894737 // sell
								if( avg2 > 164.548 )
									ret := -0.600000
							if( avg2 > 164.665 )
								if( avg <= 164.707 )
									ret := 0.750000 // buy
								if( avg > 164.707 )
									ret := 0.010753
						if( ma_upInt > 0.5 )
							if( avg2 <= 164.78 )
								if( avg2 <= 164.503 )
									ret := -0.461538
								if( avg2 > 164.503 )
									ret := -0.166667
							if( avg2 > 164.78 )
								if( avg <= 164.76 )
									ret := -0.846154 // sell
								if( avg > 164.76 )
									ret := -0.431373
				if( avg2 > 165.471 )
					if( ma_upInt <= 0.5 )
						if( ma_downInt <= 0.5 )
							ret := -1.000000 // sell
						if( ma_downInt > 0.5 )
							if( avg <= 165.427 )
								ret := -0.500000
							if( avg > 165.427 )
								ret := -1.000000 // sell
					if( ma_upInt > 0.5 )
						if( avg <= 173.867 )
							if( avg2 <= 166.576 )
								if( avg2 <= 165.88 )
									ret := -0.750000 // sell
								if( avg2 > 165.88 )
									ret := -1.000000 // sell
							if( avg2 > 166.576 )
								ret := 0.200000
						if( avg > 173.867 )
							ret := -1.000000 // sell
			if( avg2 > 169.315 )
				if( avg2 <= 170.2 )
					if( avg <= 169.774 )
						if( avg <= 168.657 )
							ret := -1.000000 // sell
						if( avg > 168.657 )
							if( avg <= 169.158 )
								if( ma_upInt <= 0.5 )
									ret := 0.666667
								if( ma_upInt > 0.5 )
									ret := 0.800000 // buy
							if( avg > 169.158 )
								if( cr_downInt <= 0.5 )
									ret := -0.219512
								if( cr_downInt > 0.5 )
									ret := 0.714286 // buy
					if( avg > 169.774 )
						if( avg <= 169.954 )
							if( avg <= 169.816 )
								if( avg <= 169.812 )
									ret := 0.666667
								if( avg > 169.812 )
									ret := 0.000000
							if( avg > 169.816 )
								if( avg <= 169.92 )
									ret := 0.865672 // buy
								if( avg > 169.92 )
									ret := 0.692308
						if( avg > 169.954 )
							if( avg <= 170.085 )
								if( avg2 <= 169.812 )
									ret := -0.777778 // sell
								if( avg2 > 169.812 )
									ret := -0.100000
							if( avg > 170.085 )
								if( avg <= 170.579 )
									ret := 0.687500
								if( avg > 170.579 )
									ret := 0.066667
				if( avg2 > 170.2 )
					if( avg <= 171.156 )
						if( avg2 <= 171.245 )
							if( avg2 <= 170.308 )
								if( avg <= 170.27 )
									ret := -0.500000
								if( avg > 170.27 )
									ret := -0.948718 // sell
							if( avg2 > 170.308 )
								if( ma_upInt <= 0.5 )
									ret := -0.605634
								if( ma_upInt > 0.5 )
									ret := -0.378378
						if( avg2 > 171.245 )
							if( avg2 <= 171.589 )
								ret := 0.857143 // buy
							if( avg2 > 171.589 )
								ret := -0.800000 // sell
					if( avg > 171.156 )
						if( avg <= 172.589 )
							if( avg <= 172.21 )
								if( avg <= 171.581 )
									ret := 0.000000
								if( avg > 171.581 )
									ret := 0.788462 // buy
							if( avg > 172.21 )
								if( avg2 <= 172.733 )
									ret := 0.250000
								if( avg2 > 172.733 )
									ret := -0.333333
						if( avg > 172.589 )
							if( avg2 <= 171.543 )
								ret := -0.333333
							if( avg2 > 171.543 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Ultimate_MA_MTF_V2 
//@version=5
//indicator title="CM_Ultimate_MA_MTF_V2", shorttitle="CM_Ultimate_MA_MTF_V2", overlay=true)

// Inputs
src = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="D")
len = input.int(20, title="Moving Average Length - LookBack Period")
factorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
spc = input(false, title="Show Price Crossing 1st Mov Avg - Highlight Bar?")
cc = input(true, title="Change Color Based On Direction?")
smoothe = input.int(2, minval=1, maxval=10, title="Color Smoothing - Setting 1 = No Smoothing")
doma2 = input(false, title="Optional 2nd Moving Average")
spc2 = input(false, title="Show Price Crossing 2nd Mov Avg?")
len2 = input.int(50, title="Moving Average Length - Optional 2nd MA")
sfactorT3 = input.float(defval=7, title="Tilson T3 Factor - *.10 - so 7 = .7 etc.", minval=0)
atype2 = input.int(1, minval=1, maxval=8, title="1=SMA, 2=EMA, 3=WMA, 4=HullMA, 5=VWMA, 6=RMA, 7=TEMA, 8=Tilson T3")
cc2 = input(true, title="Change Color Based On Direction 2nd MA?")
warn = input(false, title="***You Can Turn On The Show Dots Parameter Below Without Plotting 2nd MA to See Crosses***")
warn2 = input(false, title="***If Using Cross Feature W/O Plotting 2ndMA - Make Sure 2ndMA Parameters are Set Correctly***")
sd = input(false, title="Show Dots on Cross of Both MA's")

res = useCurrentRes ? timeframe.period : resCustom

// Hull MA definition
hullma = ta.wma(2 * ta.wma(src, len / 2) - ta.wma(src, len), math.round(math.sqrt(len)))

// TEMA definition
ema1 = ta.ema(src, len)
ema2 = ta.ema(ema1, len)
ema3 = ta.ema(ema2, len)
tema = 3 * (ema1 - ema2) + ema3

// Tilson T3 definition
factor = factorT3 * 0.10
gd(src, len, factor) => ta.ema(src, len) * (1 + factor) - ta.ema(ta.ema(src, len), len) * factor
t3(src, len, factor) => gd(gd(gd(src, len, factor), len, factor), len, factor)
tilT3 = t3(src, len, factor)

avg = atype == 1 ? ta.sma(src, len) : atype == 2 ? ta.ema(src, len) : atype == 3 ? ta.wma(src, len) : atype == 4 ? hullma : atype == 5 ? ta.vwma(src, len) : atype == 6 ? ta.rma(src, len) : atype == 7 ? tema : tilT3

// 2nd MA definitions
hullma2 = ta.wma(2 * ta.wma(src, len2 / 2) - ta.wma(src, len2), math.round(math.sqrt(len2)))
sema1 = ta.ema(src, len2)
sema2 = ta.ema(sema1, len2)
sema3 = ta.ema(sema2, len2)
stema = 3 * (sema1 - sema2) + sema3
sfactor = sfactorT3 * 0.10
sgd(src, len2, sfactor) => ta.ema(src, len2) * (1 + sfactor) - ta.ema(ta.ema(src, len2), len2) * sfactor
st3(src, len2, sfactor) => sgd(sgd(gd(src, len2, sfactor), len2, sfactor), len2, sfactor)
stilT3 = st3(src, len2, sfactor)

avg2 = atype2 == 1 ? ta.sma(src, len2) : atype2 == 2 ? ta.ema(src, len2) : atype2 == 3 ? ta.wma(src, len2) : atype2 == 4 ? hullma2 : atype2 == 5 ? ta.vwma(src, len2) : atype2 == 6 ? ta.rma(src, len2) : atype2 == 7 ? stema : stilT3

out1 = request.security(syminfo.tickerid, res, avg)
out2 = request.security(syminfo.tickerid, res, avg2)

// Formula for Price Crossing Moving Average #1
cr_up = open < out1 and close > out1
cr_down = open > out1 and close < out1

// Formula for Price Crossing Moving Average #2
cr_up2 = open < out2 and close > out2
cr_down2 = open > out2 and close < out2

// Barcolor Criteria for Price Crossing Moving Average #1
iscrossUp() => cr_up
iscrossDown() => cr_down

// Barcolor Criteria for Price Crossing Moving Average #2
iscrossUp2() => cr_up2
iscrossDown2() => cr_down2

ma_up = out1 >= ta.valuewhen(out1[smoothe] >= out1[1], out1[smoothe], 1)
ma_down = out1 < ta.valuewhen(out1[smoothe] < out1[1], out1[smoothe], 1)

col = cc ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.aqua
col2 = cc2 ? (ma_up ? color.lime : ma_down ? color.red : color.aqua) : color.white

plot(out1, title="Multi-Timeframe Moving Avg", linewidth=4, color=col)
plot(doma2 and out2 ? out2 : na, title="2nd Multi-TimeFrame Moving Average", linewidth=4, color=col2)
plot(sd and ta.crossover(out1, out2) ? out2 : na, style=plot.style_cross, linewidth=15, color=color.aqua)

// Barcolor Plot for Price Crossing Moving Average #1
barcolor(spc and iscrossUp() ? color.yellow : na)
barcolor(spc and iscrossDown() ? color.yellow : na)

// Barcolor Plot for Price Crossing Moving Average #2
barcolor(spc2 and iscrossUp2() ? color.yellow : na)
barcolor(spc2 and iscrossDown2() ? color.yellow : na)

cr_upInt = cr_up ? 1: 0    //Bool to int
cr_up2Int = cr_up2 ? 1: 0    //Bool to int
cr_downInt = cr_down ? 1: 0    //Bool to int
cr_down2Int = cr_down2 ? 1: 0    //Bool to int
ma_upInt = ma_up ? 1: 0    //Bool to int
ma_downInt = ma_down ? 1: 0    //Bool to int

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
float op_operation = decision_tree_0_SNOW_1Min_a28c0617(avg2, cr_down2Int, avg, cr_up2Int, ma_downInt, ma_upInt, cr_upInt, cr_downInt)

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


