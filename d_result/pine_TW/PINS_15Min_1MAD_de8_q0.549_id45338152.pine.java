//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Madrid_Moving_Average_Ribbon
// ID_model: PINS_15Min_1MAD_45338152 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PINS_15Min_1MAD_45338152", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PINS_15Min_45338152(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ma30_colorInt <= 3.5 )
		if( ma25_colorInt <= 1.5 )
			if( ma65_colorInt <= 3.5 )
				if( ma70 <= 26.2799 )
					if( ma15 <= 17.6685 )
						if( ma60 <= 16.871 )
							if( ma100 <= 12.2669 )
								if( ma100 <= 12.1736 )
									ret := -0.666667
								if( ma100 > 12.1736 )
									ret := -1.000000 // sell
							if( ma100 > 12.2669 )
								if( ma85 <= 12.3037 )
									ret := 1.000000 // buy
								if( ma85 > 12.3037 )
									ret := -0.004464
						if( ma60 > 16.871 )
							if( ma10 <= 17.455 )
								if( ma100 <= 17.2724 )
									ret := -0.639344
								if( ma100 > 17.2724 )
									ret := 0.809524 // buy
							if( ma10 > 17.455 )
								if( ma60 <= 17.3662 )
									ret := -0.697674
								if( ma60 > 17.3662 )
									ret := -1.000000 // sell
					if( ma15 > 17.6685 )
						if( ma60 <= 17.8289 )
							if( ma35 <= 17.8896 )
								if( ma90 <= 17.3421 )
									ret := 0.600000
								if( ma90 > 17.3421 )
									ret := 0.941176 // buy
							if( ma35 > 17.8896 )
								ret := 0.600000
						if( ma60 > 17.8289 )
							if( ma15 <= 27.364 )
								if( ma10 <= 26.9643 )
									ret := 0.019714
								if( ma10 > 26.9643 )
									ret := -0.390244
							if( ma15 > 27.364 )
								if( ma40 <= 26.9157 )
									ret := 1.000000 // buy
								if( ma40 > 26.9157 )
									ret := 0.777778 // buy
				if( ma70 > 26.2799 )
					if( ma65 <= 26.5877 )
						if( ma35 <= 26.5999 )
							if( ma45 <= 26.359 )
								ret := 0.714286 // buy
							if( ma45 > 26.359 )
								if( ma10 <= 26.6863 )
									ret := -0.370588
								if( ma10 > 26.6863 )
									ret := 0.210526
						if( ma35 > 26.5999 )
							if( ma55 <= 26.5025 )
								if( ma85 <= 26.262 )
									ret := -0.827586 // sell
								if( ma85 > 26.262 )
									ret := -0.971429 // sell
							if( ma55 > 26.5025 )
								if( ma10 <= 26.752 )
									ret := -0.895833 // sell
								if( ma10 > 26.752 )
									ret := -0.333333
					if( ma65 > 26.5877 )
						if( ma05_colorInt <= 1.5 )
							if( ma65 <= 82.444 )
								if( ma05 <= 81.1391 )
									ret := -0.094781
								if( ma05 > 81.1391 )
									ret := 0.465409
							if( ma65 > 82.444 )
								if( ma65 <= 83.7721 )
									ret := -0.669492
								if( ma65 > 83.7721 )
									ret := -0.245810
						if( ma05_colorInt > 1.5 )
							if( ma85 <= 26.6497 )
								if( ma55 <= 26.6717 )
									ret := -0.095238
								if( ma55 > 26.6717 )
									ret := 0.750000 // buy
							if( ma85 > 26.6497 )
								if( ma90 <= 27.5699 )
									ret := -0.284672
								if( ma90 > 27.5699 )
									ret := 0.047200
			if( ma65_colorInt > 3.5 )
				if( ma70 <= 21.9654 )
					if( ma20 <= 20.2693 )
						if( ma35 <= 18.0567 )
							if( ma70 <= 14.0958 )
								if( ma45 <= 11.8879 )
									ret := 1.000000 // buy
								if( ma45 > 11.8879 )
									ret := -0.440000
							if( ma70 > 14.0958 )
								if( ma40 <= 17.8311 )
									ret := 0.500000
								if( ma40 > 17.8311 )
									ret := 0.836735 // buy
						if( ma35 > 18.0567 )
							if( ma55 <= 18.4876 )
								if( ma25 <= 18.3517 )
									ret := -0.850000 // sell
								if( ma25 > 18.3517 )
									ret := -0.516129
							if( ma55 > 18.4876 )
								if( ma05 <= 19.6448 )
									ret := 0.330435
								if( ma05 > 19.6448 )
									ret := -0.185567
					if( ma20 > 20.2693 )
						if( ma35 <= 21.3213 )
							if( ma40 <= 21.03 )
								if( ma05 <= 21.0971 )
									ret := 0.944444 // buy
								if( ma05 > 21.0971 )
									ret := 0.000000
							if( ma40 > 21.03 )
								ret := 1.000000 // buy
						if( ma35 > 21.3213 )
							if( ma100 <= 21.6821 )
								if( ma25 <= 21.7103 )
									ret := -0.500000
								if( ma25 > 21.7103 )
									ret := -0.125000
							if( ma100 > 21.6821 )
								if( ma15 <= 22.0781 )
									ret := 0.891304 // buy
								if( ma15 > 22.0781 )
									ret := 0.250000
				if( ma70 > 21.9654 )
					if( ma15 <= 23.7281 )
						if( ma55 <= 22.6177 )
							if( ma80 <= 22.0022 )
								ret := -0.357143
							if( ma80 > 22.0022 )
								if( ma100 <= 22.098 )
									ret := 0.444444
								if( ma100 > 22.098 )
									ret := -0.097222
						if( ma55 > 22.6177 )
							if( ma05 <= 23.2649 )
								ret := -1.000000 // sell
							if( ma05 > 23.2649 )
								if( ma35_colorInt <= 2.5 )
									ret := -0.657407
								if( ma35_colorInt > 2.5 )
									ret := 0.625000
					if( ma15 > 23.7281 )
						if( ma55 <= 23.7036 )
							if( ma55 <= 23.536 )
								ret := 1.000000 // buy
							if( ma55 > 23.536 )
								if( ma90 <= 23.6197 )
									ret := 0.533333
								if( ma90 > 23.6197 )
									ret := 1.000000 // buy
						if( ma55 > 23.7036 )
							if( ma40 <= 34.1265 )
								if( ma30 <= 32.2857 )
									ret := 0.119668
								if( ma30 > 32.2857 )
									ret := 0.593301
							if( ma40 > 34.1265 )
								if( ma25 <= 35.7223 )
									ret := -0.410959
								if( ma25 > 35.7223 )
									ret := 0.090387
		if( ma25_colorInt > 1.5 )
			if( ma10_colorInt <= 3.5 )
				if( ma15 <= 86.9556 )
					if( ma45 <= 16.4339 )
						if( ma75 <= 14.0426 )
							if( ma20 <= 13.8953 )
								if( ma100 <= 12.0582 )
									ret := 0.647059
								if( ma100 > 12.0582 )
									ret := -0.132678
							if( ma20 > 13.8953 )
								if( ma70 <= 13.9022 )
									ret := 1.000000 // buy
								if( ma70 > 13.9022 )
									ret := 0.583333
						if( ma75 > 14.0426 )
							if( ma35_colorInt <= 2.5 )
								if( ma70_colorInt <= 1.5 )
									ret := -0.495652
								if( ma70_colorInt > 1.5 )
									ret := 0.365217
							if( ma35_colorInt > 2.5 )
								if( ma20 <= 14.3246 )
									ret := -0.516129
								if( ma20 > 14.3246 )
									ret := -0.809783 // sell
					if( ma45 > 16.4339 )
						if( ma80 <= 17.2598 )
							if( ma30 <= 16.6541 )
								if( ma85 <= 16.6292 )
									ret := 1.000000 // buy
								if( ma85 > 16.6292 )
									ret := 0.382716
							if( ma30 > 16.6541 )
								if( ma45 <= 16.5721 )
									ret := -1.000000 // sell
								if( ma45 > 16.5721 )
									ret := 0.389908
						if( ma80 > 17.2598 )
							if( ma45 <= 72.7809 )
								if( ma25 <= 72.3026 )
									ret := 0.075744
								if( ma25 > 72.3026 )
									ret := 0.883333 // buy
							if( ma45 > 72.7809 )
								if( ma15 <= 74.6215 )
									ret := -0.299838
								if( ma15 > 74.6215 )
									ret := 0.077269
				if( ma15 > 86.9556 )
					if( ma30 <= 88.5061 )
						ret := -1.000000 // sell
					if( ma30 > 88.5061 )
						ret := -0.900000 // sell
			if( ma10_colorInt > 3.5 )
				if( ma25 <= 14.0281 )
					if( ma75 <= 14.3826 )
						if( ma90 <= 12.1859 )
							if( ma05 <= 10.9993 )
								ret := -0.333333
							if( ma05 > 10.9993 )
								ret := -1.000000 // sell
						if( ma90 > 12.1859 )
							if( ma75 <= 12.9642 )
								if( ma55 <= 12.3427 )
									ret := 0.166667
								if( ma55 > 12.3427 )
									ret := -1.000000 // sell
							if( ma75 > 12.9642 )
								ret := 0.214286
					if( ma75 > 14.3826 )
						ret := -1.000000 // sell
				if( ma25 > 14.0281 )
					if( ma30 <= 15.2258 )
						ret := 0.916667 // buy
					if( ma30 > 15.2258 )
						if( ma90 <= 35.7492 )
							if( ma50 <= 35.0222 )
								if( ma80 <= 35.195 )
									ret := -0.101061
								if( ma80 > 35.195 )
									ret := 0.863636 // buy
							if( ma50 > 35.0222 )
								if( ma100 <= 35.2052 )
									ret := -0.066667
								if( ma100 > 35.2052 )
									ret := -0.706667 // sell
						if( ma90 > 35.7492 )
							if( ma45_colorInt <= 2.5 )
								if( ma45 <= 43.5155 )
									ret := -0.475000
								if( ma45 > 43.5155 )
									ret := -0.067797
							if( ma45_colorInt > 2.5 )
								if( ma05 <= 71.5191 )
									ret := 0.038835
								if( ma05 > 71.5191 )
									ret := 0.242775
	if( ma30_colorInt > 3.5 )
		if( ma100 <= 18.6467 )
			if( ma35 <= 11.8713 )
				if( ma30 <= 11.4295 )
					ret := 0.636364
				if( ma30 > 11.4295 )
					ret := 1.000000 // buy
			if( ma35 > 11.8713 )
				if( ma80 <= 16.28 )
					if( ma85 <= 13.8798 )
						if( ma65 <= 13.7691 )
							if( ma85_colorInt <= 2.5 )
								if( ma10_colorInt <= 3 )
									ret := 0.066667
								if( ma10_colorInt > 3 )
									ret := -1.000000 // sell
							if( ma85_colorInt > 2.5 )
								if( ma55 <= 11.9977 )
									ret := -1.000000 // sell
								if( ma55 > 11.9977 )
									ret := 0.287671
						if( ma65 > 13.7691 )
							if( ma10 <= 13.6589 )
								ret := 0.916667 // buy
							if( ma10 > 13.6589 )
								ret := 1.000000 // buy
					if( ma85 > 13.8798 )
						if( ma100 <= 13.9884 )
							ret := -0.166667
						if( ma100 > 13.9884 )
							if( ma55 <= 13.8824 )
								if( ma65 <= 13.7194 )
									ret := -0.923077 // sell
								if( ma65 > 13.7194 )
									ret := -1.000000 // sell
							if( ma55 > 13.8824 )
								if( ma60 <= 14.3949 )
									ret := -0.636364
								if( ma60 > 14.3949 )
									ret := -0.964286 // sell
				if( ma80 > 16.28 )
					if( ma85 <= 17.7487 )
						if( ma65 <= 17.0045 )
							if( ma50_colorInt <= 3.5 )
								if( ma55 <= 16.5893 )
									ret := 0.642857
								if( ma55 > 16.5893 )
									ret := 0.902439 // buy
							if( ma50_colorInt > 3.5 )
								if( ma80_colorInt <= 2.5 )
									ret := 0.894737 // buy
								if( ma80_colorInt > 2.5 )
									ret := -0.394495
						if( ma65 > 17.0045 )
							if( ma90 <= 17.7458 )
								if( ma90 <= 17.6974 )
									ret := 0.942529 // buy
								if( ma90 > 17.6974 )
									ret := 0.675676
							if( ma90 > 17.7458 )
								if( ma50 <= 17.4999 )
									ret := 0.727273 // buy
								if( ma50 > 17.4999 )
									ret := 0.064516
					if( ma85 > 17.7487 )
						if( ma05 <= 17.9593 )
							if( ma10 <= 17.3901 )
								ret := -1.000000 // sell
							if( ma10 > 17.3901 )
								if( ma40 <= 17.5305 )
									ret := 1.000000 // buy
								if( ma40 > 17.5305 )
									ret := -0.637681
						if( ma05 > 17.9593 )
							if( ma20_colorInt <= 2.5 )
								if( ma60 <= 18.2728 )
									ret := 0.100000
								if( ma60 > 18.2728 )
									ret := -0.617647
							if( ma20_colorInt > 2.5 )
								if( ma65 <= 18.1182 )
									ret := 0.914286 // buy
								if( ma65 > 18.1182 )
									ret := 0.246032
		if( ma100 > 18.6467 )
			if( ma60 <= 73.3825 )
				if( ma60 <= 18.5488 )
					if( ma85 <= 18.6207 )
						if( ma85_colorInt <= 3.5 )
							ret := 0.666667
						if( ma85_colorInt > 3.5 )
							ret := -0.769231 // sell
					if( ma85 > 18.6207 )
						if( ma100 <= 18.7296 )
							ret := -1.000000 // sell
						if( ma100 > 18.7296 )
							if( ma35 <= 18.2659 )
								if( ma85 <= 18.7248 )
									ret := -1.000000 // sell
								if( ma85 > 18.7248 )
									ret := -0.714286 // sell
							if( ma35 > 18.2659 )
								if( ma45 <= 18.3591 )
									ret := 0.100000
								if( ma45 > 18.3591 )
									ret := -0.923077 // sell
				if( ma60 > 18.5488 )
					if( ma05_colorInt <= 3.5 )
						if( ma50 <= 19.4997 )
							if( ma15_colorInt <= 3.5 )
								if( ma85 <= 19.0477 )
									ret := 0.619048
								if( ma85 > 19.0477 )
									ret := 1.000000 // buy
							if( ma15_colorInt > 3.5 )
								if( ma80 <= 18.706 )
									ret := -0.588235
								if( ma80 > 18.706 )
									ret := 0.360656
						if( ma50 > 19.4997 )
							if( ma85 <= 72.7477 )
								if( ma30 <= 72.3705 )
									ret := -0.068084
								if( ma30 > 72.3705 )
									ret := 1.000000 // buy
							if( ma85 > 72.7477 )
								if( ma100 <= 73.0905 )
									ret := -0.454545
								if( ma100 > 73.0905 )
									ret := -0.884615 // sell
					if( ma05_colorInt > 3.5 )
						if( ma85 <= 19.5162 )
							if( ma85 <= 19.1835 )
								if( ma40 <= 18.7091 )
									ret := -0.450704
								if( ma40 > 18.7091 )
									ret := 0.017241
							if( ma85 > 19.1835 )
								ret := -1.000000 // sell
						if( ma85 > 19.5162 )
							if( ma30 <= 19.5169 )
								if( ma20 <= 19.4234 )
									ret := 0.057143
								if( ma20 > 19.4234 )
									ret := 0.837838 // buy
							if( ma30 > 19.5169 )
								if( ma35 <= 21.4526 )
									ret := -0.300763
								if( ma35 > 21.4526 )
									ret := -0.158750
			if( ma60 > 73.3825 )
				if( ma75 <= 80.03 )
					if( ma25 <= 77.1998 )
						if( ma80 <= 75.1536 )
							if( ma85_colorInt <= 2.5 )
								ret := 1.000000 // buy
							if( ma85_colorInt > 2.5 )
								ret := 0.636364
						if( ma80 > 75.1536 )
							if( ma05_colorInt <= 3.5 )
								if( ma10 <= 75.8452 )
									ret := 0.333333
								if( ma10 > 75.8452 )
									ret := 0.000000
							if( ma05_colorInt > 3.5 )
								if( ma45 <= 75.8821 )
									ret := -0.300000
								if( ma45 > 75.8821 )
									ret := -0.250000
					if( ma25 > 77.1998 )
						if( ma75 <= 79.9987 )
							if( ma35 <= 79.7674 )
								ret := 1.000000 // buy
							if( ma35 > 79.7674 )
								ret := 0.647059
						if( ma75 > 79.9987 )
							if( ma50 <= 79.6801 )
								ret := 0.200000
							if( ma50 > 79.6801 )
								ret := 0.750000 // buy
				if( ma75 > 80.03 )
					if( ma75_colorInt <= 2.5 )
						if( ma50 <= 85.1724 )
							ret := 1.000000 // buy
						if( ma50 > 85.1724 )
							ret := 0.400000
					if( ma75_colorInt > 2.5 )
						if( ma60 <= 79.8732 )
							if( ma75 <= 80.1142 )
								ret := -0.708333 // sell
							if( ma75 > 80.1142 )
								ret := -1.000000 // sell
						if( ma60 > 79.8732 )
							if( ma65 <= 84.0364 )
								if( ma75 <= 80.1117 )
									ret := 0.600000
								if( ma75 > 80.1117 )
									ret := 0.050633
							if( ma65 > 84.0364 )
								if( ma25 <= 85.2566 )
									ret := -0.800000 // sell
								if( ma25 > 85.2566 )
									ret := 0.086957
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Madrid_Moving_Average_Ribbon 
//@version=5
//indicator "Madrid Moving Average Ribbon", shorttitle="Madrid Ribbon", overlay=true)


PHI     = (1 + math.sqrt(5)) / 2
PI      = 104348 / 33215

BULL    = 1
BEAR    = -1
NONE    = 0

GRN01 = color.rgb(124, 252, 0)
GRN02 = color.rgb(50, 205, 50)
GRN03 = color.rgb(34, 139, 34)
GRN04 = color.rgb(0, 100, 0)
GRN05 = color.rgb(0, 128, 0)
GRN06 = color.rgb(9, 53, 7)
RED01 = color.rgb(255, 69, 0)
RED02 = color.rgb(255, 0, 0)
RED03 = color.rgb(178, 34, 34)
RED04 = color.rgb(139, 0, 0)
RED05 = color.rgb(128, 0, 0)
RED06 = color.rgb(51, 13, 6)

// Define other v3 Style Colors
AQUA    = color.rgb(0, 255, 255)
BLACK   = color.rgb(0, 0, 0)
BLUE    = color.rgb(0, 0, 255)
FUCHSIA = color.rgb(255, 0, 255)
GRAY    = color.rgb(128, 128, 128)
GREEN   = color.rgb(0, 128, 0)
LIME    = color.rgb(0, 255, 0)
MAROON  = color.rgb(128, 0, 0)
NAVY    = color.rgb(0, 0, 128)
OLIVE   = color.rgb(128, 128, 0)
ORANGE  = color.rgb(255, 127, 0)
PURPLE  = color.rgb(128, 0, 128)
RUBI    = color.rgb(255, 0, 0)
SILVER  = color.rgb(192, 192, 192)
TEAL    = color.rgb(0, 128, 128)
YELLOW  = color.rgb(255, 255, 0)
WHITE   = color.rgb(255, 255, 255)


// ──────────[ Moving Average Color ]
maColor(_ma, _maRef) =>
    diffMA = ta.change(_ma)
    diffMA >= 0 and _ma > _maRef ? LIME : diffMA < 0 and _ma > _maRef ? MAROON : diffMA <= 0 and _ma < _maRef ? RUBI : diffMA >= 0 and _ma < _maRef ? GREEN : GRAY

// Function to calculate the integer representing the color condition
ma_color_int(ma, ma_ref) =>
    diff_ma = ta.change(ma)
    diff_ma >= 0 and ma > ma_ref ? 1 : diff_ma < 0 and ma > ma_ref ? 2 : diff_ma <= 0 and ma < ma_ref ? 3 : diff_ma >= 0 and ma < ma_ref ? 4 : 5


_10   = input.bool(false, '───────────[ Madrid Ribbon]───────────' )
i_exp = input(true, title="Exponential MA")

// ────────────────────[ Processing ]
src = close

ma05  = i_exp ? ta.ema(src, 5) : ta.sma(src, 5)
ma10  = i_exp ? ta.ema(src, 10) : ta.sma(src, 10)
ma15  = i_exp ? ta.ema(src, 15) : ta.sma(src, 15)
ma20  = i_exp ? ta.ema(src, 20) : ta.sma(src, 20)
ma25  = i_exp ? ta.ema(src, 25) : ta.sma(src, 25)
ma30  = i_exp ? ta.ema(src, 30) : ta.sma(src, 30)
ma35  = i_exp ? ta.ema(src, 35) : ta.sma(src, 35)
ma40  = i_exp ? ta.ema(src, 40) : ta.sma(src, 40)
ma45  = i_exp ? ta.ema(src, 45) : ta.sma(src, 45)
ma50  = i_exp ? ta.ema(src, 50) : ta.sma(src, 50)
ma55  = i_exp ? ta.ema(src, 55) : ta.sma(src, 55)
ma60  = i_exp ? ta.ema(src, 60) : ta.sma(src, 60)
ma65  = i_exp ? ta.ema(src, 65) : ta.sma(src, 65)
ma70  = i_exp ? ta.ema(src, 70) : ta.sma(src, 70)
ma75  = i_exp ? ta.ema(src, 75) : ta.sma(src, 75)
ma80  = i_exp ? ta.ema(src, 80) : ta.sma(src, 80)
ma85  = i_exp ? ta.ema(src, 85) : ta.sma(src, 85)
ma90  = i_exp ? ta.ema(src, 90) : ta.sma(src, 90)
ma100 = i_exp ? ta.ema(src, 100) : ta.sma(src, 100)

// ────────────────────[ Plot ]
plot(ma05, color=maColor(ma05, ma100), title="MMA05", linewidth=3)
plot(ma10, color=maColor(ma10, ma100), title="MMA10", linewidth=1)
plot(ma15, color=maColor(ma15, ma100), title="MMA15", linewidth=1)
plot(ma20, color=maColor(ma20, ma100), title="MMA20", linewidth=1)
plot(ma25, color=maColor(ma25, ma100), title="MMA25", linewidth=1)
plot(ma30, color=maColor(ma30, ma100), title="MMA30", linewidth=1)
plot(ma35, color=maColor(ma35, ma100), title="MMA35", linewidth=1)
plot(ma40, color=maColor(ma40, ma100), title="MMA40", linewidth=1)
plot(ma45, color=maColor(ma45, ma100), title="MMA45", linewidth=1)
plot(ma50, color=maColor(ma50, ma100), title="MMA50", linewidth=1)
plot(ma55, color=maColor(ma55, ma100), title="MMA55", linewidth=1)
plot(ma60, color=maColor(ma60, ma100), title="MMA60", linewidth=1)
plot(ma65, color=maColor(ma65, ma100), title="MMA65", linewidth=1)
plot(ma70, color=maColor(ma70, ma100), title="MMA70", linewidth=1)
plot(ma75, color=maColor(ma75, ma100), title="MMA75", linewidth=1)
plot(ma80, color=maColor(ma80, ma100), title="MMA80", linewidth=1)
plot(ma85, color=maColor(ma85, ma100), title="MMA85", linewidth=1)
plot(ma90, color=maColor(ma90, ma100), title="MMA90", linewidth=3)



//Calculate colors based on the moving averages compared to ma100
ma05_colorInt = ma_color_int(ma05, ma100)
ma10_colorInt = ma_color_int(ma10, ma100)
ma15_colorInt = ma_color_int(ma15, ma100)
ma20_colorInt = ma_color_int(ma20, ma100)
ma25_colorInt = ma_color_int(ma25, ma100)
ma30_colorInt = ma_color_int(ma30, ma100)
ma35_colorInt = ma_color_int(ma35, ma100)
ma40_colorInt = ma_color_int(ma40, ma100)
ma45_colorInt = ma_color_int(ma45, ma100)
ma50_colorInt = ma_color_int(ma50, ma100)
ma55_colorInt = ma_color_int(ma55, ma100)
ma60_colorInt = ma_color_int(ma60, ma100)
ma65_colorInt = ma_color_int(ma65, ma100)
ma70_colorInt = ma_color_int(ma70, ma100)
ma75_colorInt = ma_color_int(ma75, ma100)
ma80_colorInt = ma_color_int(ma80, ma100)
ma85_colorInt = ma_color_int(ma85, ma100)
ma90_colorInt = ma_color_int(ma90, ma100)


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
float op_operation = decision_tree_0_PINS_15Min_45338152(ma15, ma70_colorInt, ma75_colorInt, ma70, ma40_colorInt, ma80_colorInt, ma20, ma20_colorInt, ma60, ma50, ma65_colorInt, ma45, ma55, ma05_colorInt, ma35_colorInt, ma10_colorInt, ma30, ma25_colorInt, ma100, ma65, ma85, ma80, ma60_colorInt, ma85_colorInt, ma90, ma90_colorInt, ma25, ma40, ma50_colorInt, ma35, ma30_colorInt, ma45_colorInt, ma05, ma75, ma55_colorInt, ma10, ma15_colorInt)

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


