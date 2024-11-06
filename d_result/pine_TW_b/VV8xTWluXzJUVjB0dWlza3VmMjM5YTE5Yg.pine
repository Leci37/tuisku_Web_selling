//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: U_1Min_2TV0_f239a19b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2TV0_f239a19b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_f239a19b(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -0.019623 )
		if( VIP_VIM <= -0.74511 )
			if( ema1 <= 23.8021 )
				if( ema3 <= 23.4117 )
					if( VIP <= 5.40373 )
						if( ema1 <= 23.1212 )
							if( ema12 <= -0.061359 )
								if( ema1 <= 22.0451 )
									ret := 0.328748
								if( ema1 > 22.0451 )
									ret := -0.151515
							if( ema12 > -0.061359 )
								if( ema1 <= 22.5764 )
									ret := 0.077210
								if( ema1 > 22.5764 )
									ret := -0.315315
						if( ema1 > 23.1212 )
							if( VIP <= 1.98223 )
								if( ema1 <= 23.2047 )
									ret := 0.636364
								if( ema1 > 23.2047 )
									ret := 0.968750 // buy
							if( VIP > 1.98223 )
								if( ema12 <= -0.04036 )
									ret := -0.357143
								if( ema12 > -0.04036 )
									ret := 0.833333 // buy
					if( VIP > 5.40373 )
						if( ema13 <= -0.040387 )
							if( VIP <= 11.8613 )
								if( ema13 <= -0.076538 )
									ret := 0.666667
								if( ema13 > -0.076538 )
									ret := 0.977778 // buy
							if( VIP > 11.8613 )
								if( ema12 <= -0.029985 )
									ret := 0.176471
								if( ema12 > -0.029985 )
									ret := 0.900000 // buy
						if( ema13 > -0.040387 )
							if( ema1 <= 16.8699 )
								ret := -0.266667
							if( ema1 > 16.8699 )
								ret := 0.375000
				if( ema3 > 23.4117 )
					if( ema3 <= 23.509 )
						if( ema3 <= 23.4517 )
							if( ema13 <= -0.096744 )
								ret := -0.583333
							if( ema13 > -0.096744 )
								ret := -1.000000 // sell
						if( ema3 > 23.4517 )
							ret := -1.000000 // sell
					if( ema3 > 23.509 )
						if( ema3 <= 23.7831 )
							if( VIP <= 0.698642 )
								ret := -0.125000
							if( VIP > 0.698642 )
								ret := 0.636364
						if( ema3 > 23.7831 )
							ret := -0.866667 // sell
			if( ema1 > 23.8021 )
				if( ema1 <= 25.1644 )
					if( tema <= 24.0577 )
						if( VIM <= 1.54149 )
							if( VIM <= 1.42989 )
								ret := 1.000000 // buy
							if( VIM > 1.42989 )
								ret := 0.700000 // buy
						if( VIM > 1.54149 )
							ret := 1.000000 // buy
					if( tema > 24.0577 )
						if( ema2 <= 24.2497 )
							ret := -0.190476
						if( ema2 > 24.2497 )
							if( ema1 <= 24.8611 )
								if( VIM <= 1.55778 )
									ret := 0.346154
								if( VIM > 1.55778 )
									ret := 0.900000 // buy
							if( ema1 > 24.8611 )
								if( ema12 <= -0.026926 )
									ret := 1.000000 // buy
								if( ema12 > -0.026926 )
									ret := 0.888889 // buy
				if( ema1 > 25.1644 )
					ret := -0.533333
		if( VIP_VIM > -0.74511 )
			if( VIM <= 1.3439 )
				if( ema2 <= 15.4105 )
					if( ema12 <= -0.035163 )
						if( VIM <= 1.28567 )
							if( ema12 <= -0.04255 )
								if( ema1 <= 15.1298 )
									ret := 0.830986 // buy
								if( ema1 > 15.1298 )
									ret := 0.171429
							if( ema12 > -0.04255 )
								if( VIP_VIM <= -0.344343 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.344343 )
									ret := 0.904762 // buy
						if( VIM > 1.28567 )
							if( ema2 <= 14.5369 )
								ret := 0.647059
							if( ema2 > 14.5369 )
								if( ema12 <= -0.047972 )
									ret := 0.000000
								if( ema12 > -0.047972 )
									ret := -0.900000 // sell
					if( ema12 > -0.035163 )
						if( ema1 <= 14.5629 )
							if( VIP <= 0.883147 )
								if( ema3 <= 14.4976 )
									ret := -0.055944
								if( ema3 > 14.4976 )
									ret := -0.793651 // sell
							if( VIP > 0.883147 )
								if( ema12 <= -0.022789 )
									ret := 1.000000 // buy
								if( ema12 > -0.022789 )
									ret := 0.687500
						if( ema1 > 14.5629 )
							if( ema1 <= 15.2668 )
								if( ema2 <= 15.0888 )
									ret := 0.375000
								if( ema2 > 15.0888 )
									ret := 0.783505 // buy
							if( ema1 > 15.2668 )
								if( VIM <= 1.18016 )
									ret := 0.777778 // buy
								if( VIM > 1.18016 )
									ret := -0.193548
				if( ema2 > 15.4105 )
					if( ema3 <= 16.0591 )
						if( ema3 <= 15.8825 )
							if( ema13 <= -0.029491 )
								if( VIM <= 1.31487 )
									ret := 0.119760
								if( VIM > 1.31487 )
									ret := -0.666667
							if( ema13 > -0.029491 )
								if( ema2 <= 15.6354 )
									ret := -1.000000 // sell
								if( ema2 > 15.6354 )
									ret := -0.909091 // sell
						if( ema3 > 15.8825 )
							if( ema12 <= -0.025152 )
								if( VIP_VIM <= -0.402183 )
									ret := -0.780645 // sell
								if( VIP_VIM > -0.402183 )
									ret := -0.175439
							if( ema12 > -0.025152 )
								if( ema3 <= 16.0546 )
									ret := 0.225000
								if( ema3 > 16.0546 )
									ret := -1.000000 // sell
					if( ema3 > 16.0591 )
						if( ema2 <= 16.3565 )
							if( tema <= 15.9572 )
								if( ema1 <= 15.9946 )
									ret := 0.100000
								if( ema1 > 15.9946 )
									ret := -0.888889 // sell
							if( tema > 15.9572 )
								if( ema3 <= 16.3726 )
									ret := 0.289817
								if( ema3 > 16.3726 )
									ret := 0.961538 // buy
						if( ema2 > 16.3565 )
							if( ema2 <= 17.8135 )
								if( VIM <= 1.26652 )
									ret := -0.183324
								if( VIM > 1.26652 )
									ret := 0.061590
							if( ema2 > 17.8135 )
								if( ema1 <= 19.1255 )
									ret := 0.254669
								if( ema1 > 19.1255 )
									ret := -0.016379
			if( VIM > 1.3439 )
				if( ema13 <= -0.057963 )
					if( ema12 <= -0.083162 )
						if( VIP_VIM <= -0.722742 )
							if( ema3 <= 20.946 )
								ret := -0.750000 // sell
							if( ema3 > 20.946 )
								ret := -0.272727
						if( VIP_VIM > -0.722742 )
							if( ema13 <= -0.316167 )
								ret := 0.000000
							if( ema13 > -0.316167 )
								if( ema12 <= -0.128545 )
									ret := -0.111111
								if( ema12 > -0.128545 )
									ret := 0.683908
					if( ema12 > -0.083162 )
						if( ema2 <= 25.215 )
							if( ema1 <= 13.718 )
								if( tema <= 13.3268 )
									ret := 0.000000
								if( tema > 13.3268 )
									ret := -1.000000 // sell
							if( ema1 > 13.718 )
								if( VIP <= 4.4175 )
									ret := -0.041204
								if( VIP > 4.4175 )
									ret := 0.620000
						if( ema2 > 25.215 )
							if( tema <= 25.2945 )
								ret := 1.000000 // buy
							if( tema > 25.2945 )
								ret := 0.555556
				if( ema13 > -0.057963 )
					if( ema3 <= 14.2341 )
						if( ema13 <= -0.037382 )
							ret := 1.000000 // buy
						if( ema13 > -0.037382 )
							ret := 0.523810
					if( ema3 > 14.2341 )
						if( ema2 <= 14.8225 )
							if( ema2 <= 14.6122 )
								if( VIM <= 1.80225 )
									ret := -0.394737
								if( VIM > 1.80225 )
									ret := 0.714286 // buy
							if( ema2 > 14.6122 )
								if( VIP <= 1.89021 )
									ret := -0.857143 // sell
								if( VIP > 1.89021 )
									ret := -0.600000
						if( ema2 > 14.8225 )
							if( VIP_VIM <= 0.982871 )
								if( ema3 <= 23.6228 )
									ret := 0.321511
								if( ema3 > 23.6228 )
									ret := -0.135135
							if( VIP_VIM > 0.982871 )
								if( tema <= 15.8422 )
									ret := 0.777778 // buy
								if( tema > 15.8422 )
									ret := -0.725000 // sell
	if( ema12 > -0.019623 )
		if( VIM <= 0.699029 )
			if( tema <= 18.2654 )
				if( VIP_VIM <= 0.705432 )
					if( VIM <= 0.666853 )
						if( ema13 <= 0.051603 )
							if( ema1 <= 17.0175 )
								if( ema3 <= 15.674 )
									ret := -0.815789 // sell
								if( ema3 > 15.674 )
									ret := -0.491803
							if( ema1 > 17.0175 )
								if( VIP <= 1.2969 )
									ret := 0.650000
								if( VIP > 1.2969 )
									ret := 0.037037
						if( ema13 > 0.051603 )
							if( ema13 <= 0.109868 )
								if( ema2 <= 16.1638 )
									ret := 0.021277
								if( ema2 > 16.1638 )
									ret := 0.450549
							if( ema13 > 0.109868 )
								if( ema13 <= 0.331458 )
									ret := -0.386667
								if( ema13 > 0.331458 )
									ret := 0.529412
					if( VIM > 0.666853 )
						if( tema <= 17.1816 )
							if( tema <= 16.5713 )
								if( ema1 <= 16.31 )
									ret := 0.295652
								if( ema1 > 16.31 )
									ret := -0.396552
							if( tema > 16.5713 )
								if( ema13 <= 0.05212 )
									ret := 0.193182
								if( ema13 > 0.05212 )
									ret := 0.774510 // buy
						if( tema > 17.1816 )
							if( VIP_VIM <= 0.537038 )
								ret := -0.700000 // sell
							if( VIP_VIM > 0.537038 )
								if( ema1 <= 17.8108 )
									ret := -0.158730
								if( ema1 > 17.8108 )
									ret := 0.565217
				if( VIP_VIM > 0.705432 )
					if( ema12 <= 0.036044 )
						if( VIM <= 0.492705 )
							if( ema2 <= 16.3035 )
								ret := 0.428571
							if( ema2 > 16.3035 )
								ret := -0.833333 // sell
						if( VIM > 0.492705 )
							if( ema3 <= 17.6897 )
								if( tema <= 17.6745 )
									ret := 0.102804
								if( tema > 17.6745 )
									ret := -0.600000
							if( ema3 > 17.6897 )
								if( tema <= 17.9744 )
									ret := 0.666667
								if( tema > 17.9744 )
									ret := 0.000000
					if( ema12 > 0.036044 )
						if( tema <= 17.3868 )
							if( VIP <= 1.35418 )
								if( ema1 <= 16.3959 )
									ret := 0.878378 // buy
								if( ema1 > 16.3959 )
									ret := -0.500000
							if( VIP > 1.35418 )
								if( ema3 <= 16.932 )
									ret := 0.230670
								if( ema3 > 16.932 )
									ret := -0.267606
						if( tema > 17.3868 )
							if( tema <= 18.0395 )
								if( VIP <= 1.41704 )
									ret := 0.494382
								if( VIP > 1.41704 )
									ret := 0.909091 // buy
							if( tema > 18.0395 )
								if( VIP_VIM <= 0.975156 )
									ret := 0.214286
								if( VIP_VIM > 0.975156 )
									ret := -0.846154 // sell
			if( tema > 18.2654 )
				if( ema1 <= 21.2901 )
					if( VIP_VIM <= 0.592481 )
						if( ema12 <= 0.049245 )
							if( VIM <= 0.687879 )
								ret := 0.375000
							if( VIM > 0.687879 )
								ret := -0.375000
						if( ema12 > 0.049245 )
							if( ema3 <= 20.0964 )
								ret := 1.000000 // buy
							if( ema3 > 20.0964 )
								ret := 0.636364
					if( VIP_VIM > 0.592481 )
						if( ema13 <= 0.052998 )
							if( VIP <= 1.29637 )
								ret := 0.750000 // buy
							if( VIP > 1.29637 )
								if( ema1 <= 20.0836 )
									ret := -0.300000
								if( ema1 > 20.0836 )
									ret := 0.263158
						if( ema13 > 0.052998 )
							if( ema2 <= 20.5445 )
								if( ema2 <= 18.5027 )
									ret := -0.721519 // sell
								if( ema2 > 18.5027 )
									ret := -0.138756
							if( ema2 > 20.5445 )
								if( ema12 <= 0.042943 )
									ret := 0.000000
								if( ema12 > 0.042943 )
									ret := -0.753731 // sell
				if( ema1 > 21.2901 )
					if( VIP_VIM <= 1.0472 )
						if( tema <= 21.37 )
							ret := 0.950000 // buy
						if( tema > 21.37 )
							if( ema3 <= 21.7094 )
								if( ema13 <= 0.120617 )
									ret := 0.177083
								if( ema13 > 0.120617 )
									ret := -0.545455
							if( ema3 > 21.7094 )
								if( ema2 <= 21.8024 )
									ret := 0.918919 // buy
								if( ema2 > 21.8024 )
									ret := 0.201018
					if( VIP_VIM > 1.0472 )
						if( tema <= 24.5422 )
							if( ema3 <= 23.0249 )
								ret := 0.052632
							if( ema3 > 23.0249 )
								ret := -0.428571
						if( tema > 24.5422 )
							ret := -1.000000 // sell
		if( VIM > 0.699029 )
			if( tema <= 14.2902 )
				if( ema2 <= 14.1876 )
					if( ema12 <= -0.007132 )
						if( VIP <= 0.892319 )
							if( ema2 <= 14.0865 )
								if( ema3 <= 14.0619 )
									ret := -0.222222
								if( ema3 > 14.0619 )
									ret := -0.600000
							if( ema2 > 14.0865 )
								ret := -1.000000 // sell
						if( VIP > 0.892319 )
							if( ema13 <= -0.004739 )
								if( VIP <= 1.01988 )
									ret := 0.872727 // buy
								if( VIP > 1.01988 )
									ret := 0.442857
							if( ema13 > -0.004739 )
								ret := -0.538462
					if( ema12 > -0.007132 )
						if( VIP_VIM <= 0.151981 )
							if( tema <= 13.7186 )
								if( ema2 <= 13.4547 )
									ret := -0.400000
								if( ema2 > 13.4547 )
									ret := 0.869565 // buy
							if( tema > 13.7186 )
								if( ema2 <= 13.8371 )
									ret := -0.854545 // sell
								if( ema2 > 13.8371 )
									ret := -0.291304
						if( VIP_VIM > 0.151981 )
							if( tema <= 13.8774 )
								if( tema <= 13.6559 )
									ret := 1.000000 // buy
								if( tema > 13.6559 )
									ret := 0.574074
							if( tema > 13.8774 )
								if( tema <= 13.9179 )
									ret := -0.742857 // sell
								if( tema > 13.9179 )
									ret := 0.059322
				if( ema2 > 14.1876 )
					if( ema3 <= 14.2856 )
						if( VIP <= 4.58797 )
							if( VIP <= 0.990269 )
								if( VIM <= 1.17206 )
									ret := 0.469388
								if( VIM > 1.17206 )
									ret := 0.886364 // buy
							if( VIP > 0.990269 )
								if( ema1 <= 14.277 )
									ret := 0.295597
								if( ema1 > 14.277 )
									ret := 0.853659 // buy
						if( VIP > 4.58797 )
							if( ema3 <= 14.2396 )
								if( ema3 <= 14.2172 )
									ret := -0.333333
								if( ema3 > 14.2172 )
									ret := 0.400000
							if( ema3 > 14.2396 )
								if( ema3 <= 14.2749 )
									ret := -0.909091 // sell
								if( ema3 > 14.2749 )
									ret := -0.500000
					if( ema3 > 14.2856 )
						if( tema <= 14.2821 )
							if( ema2 <= 14.2736 )
								ret := -0.866667 // sell
							if( ema2 > 14.2736 )
								if( VIM <= 1.18717 )
									ret := -0.111111
								if( VIM > 1.18717 )
									ret := -0.666667
						if( tema > 14.2821 )
							ret := 0.370370
			if( tema > 14.2902 )
				if( ema12 <= 0.001154 )
					if( VIM <= 3.25203 )
						if( ema1 <= 14.5011 )
							if( VIP <= 0.806538 )
								if( ema3 <= 14.4229 )
									ret := -1.000000 // sell
								if( ema3 > 14.4229 )
									ret := -0.444444
							if( VIP > 0.806538 )
								if( VIP_VIM <= -0.187637 )
									ret := 0.662162
								if( VIP_VIM > -0.187637 )
									ret := 0.183183
						if( ema1 > 14.5011 )
							if( ema1 <= 14.856 )
								if( ema3 <= 14.7181 )
									ret := -0.242291
								if( ema3 > 14.7181 )
									ret := -0.776596 // sell
							if( ema1 > 14.856 )
								if( ema3 <= 15.2553 )
									ret := 0.242268
								if( ema3 > 15.2553 )
									ret := -0.037244
					if( VIM > 3.25203 )
						if( ema12 <= -0.007725 )
							if( ema3 <= 21.7504 )
								if( VIM <= 4.54409 )
									ret := 0.279683
								if( VIM > 4.54409 )
									ret := 0.456120
							if( ema3 > 21.7504 )
								if( ema2 <= 21.8172 )
									ret := -0.857143 // sell
								if( ema2 > 21.8172 )
									ret := 0.260355
						if( ema12 > -0.007725 )
							if( VIP_VIM <= -0.580524 )
								if( tema <= 15.7425 )
									ret := 0.373134
								if( tema > 15.7425 )
									ret := -0.120558
							if( VIP_VIM > -0.580524 )
								if( ema3 <= 22.5179 )
									ret := 0.189032
								if( ema3 > 22.5179 )
									ret := -0.141975
				if( ema12 > 0.001154 )
					if( VIP <= 1.8098 )
						if( tema <= 14.9413 )
							if( ema3 <= 14.3079 )
								if( ema3 <= 14.1732 )
									ret := 0.352941
								if( ema3 > 14.1732 )
									ret := -0.643836
							if( ema3 > 14.3079 )
								if( ema2 <= 14.6564 )
									ret := -0.023199
								if( ema2 > 14.6564 )
									ret := -0.492754
						if( tema > 14.9413 )
							if( ema1 <= 15.2371 )
								if( VIP_VIM <= 0.532364 )
									ret := 0.482759
								if( VIP_VIM > 0.532364 )
									ret := -0.391304
							if( ema1 > 15.2371 )
								if( ema1 <= 15.2948 )
									ret := -0.438525
								if( ema1 > 15.2948 )
									ret := -0.008840
					if( VIP > 1.8098 )
						if( ema13 <= 0.056209 )
							if( ema3 <= 14.4432 )
								if( VIP_VIM <= -0.483065 )
									ret := -0.090909
								if( VIP_VIM > -0.483065 )
									ret := -0.920455 // sell
							if( ema3 > 14.4432 )
								if( ema12 <= 0.003939 )
									ret := -0.074848
								if( ema12 > 0.003939 )
									ret := -0.218023
						if( ema13 > 0.056209 )
							if( VIM <= 1.16762 )
								if( VIP_VIM <= 1.25177 )
									ret := -0.274510
								if( VIP_VIM > 1.25177 )
									ret := -0.800000 // sell
							if( VIM > 1.16762 )
								if( ema12 <= 0.038591 )
									ret := 0.345055
								if( ema12 > 0.038591 )
									ret := -0.082794
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3



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
float op_operation = decision_tree_0_U_1Min_f239a19b(ema2, ema1, ema12, ema3, ema13, tema, VIP, VIP_VIM, VIM)

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


