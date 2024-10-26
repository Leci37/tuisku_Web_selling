//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: XRPUSDT_30Min_2TV0_e16e3284 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2TV0_e16e3284", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_e16e3284(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.00275 )
		if( ema3 <= 0.628276 )
			if( tema <= 0.307704 )
				if( ema3 <= 0.244227 )
					if( ema3 <= 0.217505 )
						if( tema <= 0.198194 )
							ret := 1.000000 // buy
						if( tema > 0.198194 )
							if( ema13 <= -0.005005 )
								ret := -0.500000
							if( ema13 > -0.005005 )
								ret := 1.000000 // buy
					if( ema3 > 0.217505 )
						if( ema13 <= -0.005325 )
							if( VIM <= 1.2729 )
								if( ema13 <= -0.01262 )
									ret := -0.800000 // sell
								if( ema13 > -0.01262 )
									ret := -1.000000 // sell
							if( VIM > 1.2729 )
								ret := -0.250000
						if( ema13 > -0.005325 )
							if( ema2 <= 0.228179 )
								ret := 1.000000 // buy
							if( ema2 > 0.228179 )
								ret := 0.400000
				if( ema3 > 0.244227 )
					if( ema3 <= 0.292456 )
						if( ema3 <= 0.279952 )
							if( ema13 <= -0.012775 )
								if( ema13 <= -0.016019 )
									ret := 0.450000
								if( ema13 > -0.016019 )
									ret := -1.000000 // sell
							if( ema13 > -0.012775 )
								if( tema <= 0.260058 )
									ret := 0.871429 // buy
								if( tema > 0.260058 )
									ret := 0.500000
						if( ema3 > 0.279952 )
							if( tema <= 0.279637 )
								if( ema3 <= 0.290595 )
									ret := -0.179487
								if( ema3 > 0.290595 )
									ret := 1.000000 // buy
							if( tema > 0.279637 )
								ret := -1.000000 // sell
					if( ema3 > 0.292456 )
						if( ema3 <= 0.313941 )
							if( ema13 <= -0.005328 )
								if( VIP_VIM <= -0.207154 )
									ret := 0.913043 // buy
								if( VIP_VIM > -0.207154 )
									ret := 0.250000
							if( ema13 > -0.005328 )
								if( ema1 <= 0.291302 )
									ret := 0.000000
								if( ema1 > 0.291302 )
									ret := 0.833333 // buy
						if( ema3 > 0.313941 )
							if( VIM <= 1.11763 )
								if( tema <= 0.305732 )
									ret := -0.777778 // sell
								if( tema > 0.305732 )
									ret := 0.600000
							if( VIM > 1.11763 )
								if( VIM <= 1.21436 )
									ret := 0.862069 // buy
								if( VIM > 1.21436 )
									ret := 0.052632
			if( tema > 0.307704 )
				if( ema2 <= 0.362314 )
					if( ema13 <= -0.003701 )
						if( VIP <= 0.919421 )
							if( ema12 <= -0.007669 )
								if( ema12 <= -0.008941 )
									ret := 1.000000 // buy
								if( ema12 > -0.008941 )
									ret := 0.500000
							if( ema12 > -0.007669 )
								if( VIP_VIM <= -0.22043 )
									ret := -0.142857
								if( VIP_VIM > -0.22043 )
									ret := 0.733333 // buy
						if( VIP > 0.919421 )
							if( ema13 <= -0.008212 )
								ret := -1.000000 // sell
							if( ema13 > -0.008212 )
								if( VIM <= 1.07609 )
									ret := -0.250000
								if( VIM > 1.07609 )
									ret := -0.923077 // sell
					if( ema13 > -0.003701 )
						if( VIP <= 0.897004 )
							ret := 0.000000
						if( VIP > 0.897004 )
							if( VIP_VIM <= -0.053111 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.053111 )
								ret := 0.750000 // buy
				if( ema2 > 0.362314 )
					if( VIP_VIM <= -0.779805 )
						if( VIP <= 0.553029 )
							if( ema13 <= -0.008501 )
								if( VIP <= 0.544897 )
									ret := 1.000000 // buy
								if( VIP > 0.544897 )
									ret := 0.750000 // buy
							if( ema13 > -0.008501 )
								if( VIP <= 0.531719 )
									ret := 1.000000 // buy
								if( VIP > 0.531719 )
									ret := 0.500000
						if( VIP > 0.553029 )
							if( ema12 <= -0.006268 )
								if( ema13 <= -0.014478 )
									ret := 0.750000 // buy
								if( ema13 > -0.014478 )
									ret := 1.000000 // buy
							if( ema12 > -0.006268 )
								if( ema2 <= 0.38907 )
									ret := 0.000000
								if( ema2 > 0.38907 )
									ret := -0.428571
					if( VIP_VIM > -0.779805 )
						if( ema2 <= 0.557801 )
							if( ema3 <= 0.52963 )
								if( VIM <= 1.27119 )
									ret := 0.271974
								if( VIM > 1.27119 )
									ret := 0.119923
							if( ema3 > 0.52963 )
								if( ema2 <= 0.540276 )
									ret := -0.254286
								if( ema2 > 0.540276 )
									ret := 0.113314
						if( ema2 > 0.557801 )
							if( VIP <= 0.717156 )
								if( VIM <= 1.3597 )
									ret := 0.515625
								if( VIM > 1.3597 )
									ret := -0.714286 // sell
							if( VIP > 0.717156 )
								if( ema12 <= -0.018635 )
									ret := -0.833333 // sell
								if( ema12 > -0.018635 )
									ret := 0.256348
		if( ema3 > 0.628276 )
			if( ema12 <= -0.005673 )
				if( ema1 <= 1.42989 )
					if( ema12 <= -0.022125 )
						if( ema3 <= 1.29984 )
							if( ema3 <= 1.24041 )
								if( VIP_VIM <= -0.381109 )
									ret := 0.648810
								if( VIP_VIM > -0.381109 )
									ret := -0.186047
							if( ema3 > 1.24041 )
								if( VIP <= 0.736685 )
									ret := 0.000000
								if( VIP > 0.736685 )
									ret := -0.950000 // sell
						if( ema3 > 1.29984 )
							if( VIP_VIM <= -0.198749 )
								if( VIM <= 1.24551 )
									ret := 0.806250 // buy
								if( VIM > 1.24551 )
									ret := 0.000000
							if( VIP_VIM > -0.198749 )
								if( ema3 <= 1.34462 )
									ret := 1.000000 // buy
								if( ema3 > 1.34462 )
									ret := -0.500000
					if( ema12 > -0.022125 )
						if( VIP <= 0.844935 )
							if( ema1 <= 0.615454 )
								if( tema <= 0.594588 )
									ret := 0.000000
								if( tema > 0.594588 )
									ret := -1.000000 // sell
							if( ema1 > 0.615454 )
								if( ema1 <= 0.623335 )
									ret := 0.771429 // buy
								if( ema1 > 0.623335 )
									ret := 0.098279
						if( VIP > 0.844935 )
							if( ema1 <= 1.35712 )
								if( VIP_VIM <= -0.179401 )
									ret := 0.365535
								if( VIP_VIM > -0.179401 )
									ret := 0.184573
							if( ema1 > 1.35712 )
								if( ema13 <= -0.035002 )
									ret := 0.857143 // buy
								if( ema13 > -0.035002 )
									ret := -0.072072
				if( ema1 > 1.42989 )
					if( VIP <= 0.820068 )
						if( ema1 <= 1.54101 )
							if( ema1 <= 1.50685 )
								if( VIM <= 1.14982 )
									ret := 0.900000 // buy
								if( VIM > 1.14982 )
									ret := 0.066667
							if( ema1 > 1.50685 )
								if( VIP_VIM <= -0.514634 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.514634 )
									ret := -0.896552 // sell
						if( ema1 > 1.54101 )
							if( VIM <= 1.22581 )
								if( VIP_VIM <= -0.347695 )
									ret := 0.939394 // buy
								if( VIP_VIM > -0.347695 )
									ret := 0.333333
							if( VIM > 1.22581 )
								ret := -0.200000
					if( VIP > 0.820068 )
						if( ema13 <= -0.006142 )
							if( ema1 <= 1.56291 )
								if( VIP <= 0.946597 )
									ret := -0.770000 // sell
								if( VIP > 0.946597 )
									ret := 0.000000
							if( ema1 > 1.56291 )
								if( ema1 <= 1.59374 )
									ret := 0.438356
								if( ema1 > 1.59374 )
									ret := -0.466258
						if( ema13 > -0.006142 )
							if( ema2 <= 1.5856 )
								ret := -0.200000
							if( ema2 > 1.5856 )
								if( VIP_VIM <= -0.074188 )
									ret := 0.500000
								if( VIP_VIM > -0.074188 )
									ret := 0.950000 // buy
			if( ema12 > -0.005673 )
				if( VIP <= 0.75625 )
					if( VIM <= 1.21575 )
						if( ema1 <= 0.758503 )
							if( VIP <= 0.74846 )
								if( tema <= 0.74923 )
									ret := 0.115385
								if( tema > 0.74923 )
									ret := 1.000000 // buy
							if( VIP > 0.74846 )
								if( ema12 <= -0.00344 )
									ret := 1.000000 // buy
								if( ema12 > -0.00344 )
									ret := 0.500000
						if( ema1 > 0.758503 )
							if( ema3 <= 0.855979 )
								if( VIP <= 0.72648 )
									ret := 0.000000
								if( VIP > 0.72648 )
									ret := -0.782609 // sell
							if( ema3 > 0.855979 )
								if( VIP_VIM <= -0.401863 )
									ret := 0.571429
								if( VIP_VIM > -0.401863 )
									ret := -0.750000 // sell
					if( VIM > 1.21575 )
						if( ema3 <= 0.758536 )
							if( ema2 <= 0.741933 )
								if( ema2 <= 0.699844 )
									ret := -0.525641
								if( ema2 > 0.699844 )
									ret := 0.272727
							if( ema2 > 0.741933 )
								if( ema1 <= 0.74808 )
									ret := -1.000000 // sell
								if( ema1 > 0.74808 )
									ret := -0.750000 // sell
						if( ema3 > 0.758536 )
							if( ema2 <= 0.756846 )
								if( VIM <= 1.25872 )
									ret := 1.000000 // buy
								if( VIM > 1.25872 )
									ret := 0.750000 // buy
							if( ema2 > 0.756846 )
								if( ema3 <= 0.765592 )
									ret := -0.666667
								if( ema3 > 0.765592 )
									ret := -0.086957
				if( VIP > 0.75625 )
					if( ema1 <= 0.795333 )
						if( ema2 <= 0.699616 )
							if( VIP <= 0.912666 )
								if( VIP <= 0.820637 )
									ret := -0.274648
								if( VIP > 0.820637 )
									ret := 0.170635
							if( VIP > 0.912666 )
								if( tema <= 0.642524 )
									ret := 0.044118
								if( tema > 0.642524 )
									ret := -0.754717 // sell
						if( ema2 > 0.699616 )
							if( ema1 <= 0.721052 )
								if( ema1 <= 0.700235 )
									ret := 0.240000
								if( ema1 > 0.700235 )
									ret := 0.699301
							if( ema1 > 0.721052 )
								if( tema <= 0.784473 )
									ret := 0.146341
								if( tema > 0.784473 )
									ret := 0.642857
					if( ema1 > 0.795333 )
						if( ema2 <= 0.814988 )
							if( ema13 <= -0.006494 )
								if( VIP <= 0.918082 )
									ret := -0.775510 // sell
								if( VIP > 0.918082 )
									ret := 0.250000
							if( ema13 > -0.006494 )
								if( tema <= 0.797763 )
									ret := 0.400000
								if( tema > 0.797763 )
									ret := -0.600000
						if( ema2 > 0.814988 )
							if( VIM <= 1.17755 )
								if( VIP <= 0.850806 )
									ret := 0.336134
								if( VIP > 0.850806 )
									ret := -0.023860
							if( VIM > 1.17755 )
								if( ema1 <= 1.03324 )
									ret := -0.384000
								if( ema1 > 1.03324 )
									ret := 0.130435
	if( ema12 > -0.00275 )
		if( ema1 <= 1.58383 )
			if( VIM <= 0.70097 )
				if( VIP_VIM <= 0.833426 )
					if( VIM <= 0.551957 )
						if( ema12 <= 0.004951 )
							if( tema <= 0.374646 )
								if( VIM <= 0.531191 )
									ret := -0.857143 // sell
								if( VIM > 0.531191 )
									ret := -0.250000
							if( tema > 0.374646 )
								if( tema <= 0.482747 )
									ret := 0.500000
								if( tema > 0.482747 )
									ret := -0.166667
						if( ema12 > 0.004951 )
							if( VIP <= 1.32647 )
								if( ema13 <= 0.010296 )
									ret := -0.904762 // sell
								if( ema13 > 0.010296 )
									ret := -0.477273
							if( VIP > 1.32647 )
								ret := -1.000000 // sell
					if( VIM > 0.551957 )
						if( ema2 <= 0.24222 )
							if( ema12 <= 0.002388 )
								if( VIP_VIM <= 0.648687 )
									ret := 0.916667 // buy
								if( VIP_VIM > 0.648687 )
									ret := 0.500000
							if( ema12 > 0.002388 )
								ret := 0.000000
						if( ema2 > 0.24222 )
							if( ema3 <= 0.292603 )
								if( ema12 <= 0.002319 )
									ret := -0.045455
								if( ema12 > 0.002319 )
									ret := -0.765957 // sell
							if( ema3 > 0.292603 )
								if( ema13 <= 0.009336 )
									ret := -0.035670
								if( ema13 > 0.009336 )
									ret := -0.186267
				if( VIP_VIM > 0.833426 )
					if( ema13 <= 0.032208 )
						if( ema3 <= 0.363851 )
							if( VIP_VIM <= 0.84188 )
								ret := 0.666667
							if( VIP_VIM > 0.84188 )
								if( ema3 <= 0.245137 )
									ret := 0.375000
								if( ema3 > 0.245137 )
									ret := -0.583333
						if( ema3 > 0.363851 )
							if( ema2 <= 0.433922 )
								if( ema12 <= 0.007915 )
									ret := 0.444444
								if( ema12 > 0.007915 )
									ret := 1.000000 // buy
							if( ema2 > 0.433922 )
								if( tema <= 0.624364 )
									ret := -0.029412
								if( tema > 0.624364 )
									ret := 0.425926
					if( ema13 > 0.032208 )
						if( VIP_VIM <= 0.981183 )
							if( ema13 <= 0.094633 )
								if( VIP <= 1.38894 )
									ret := -0.142857
								if( VIP > 1.38894 )
									ret := -0.870968 // sell
							if( ema13 > 0.094633 )
								ret := 1.000000 // buy
						if( VIP_VIM > 0.981183 )
							if( ema1 <= 0.628566 )
								ret := 1.000000 // buy
							if( ema1 > 0.628566 )
								ret := -1.000000 // sell
			if( VIM > 0.70097 )
				if( tema <= 0.235424 )
					if( ema1 <= 0.217406 )
						if( VIM <= 1.10016 )
							if( tema <= 0.214676 )
								if( VIP_VIM <= -0.092771 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.092771 )
									ret := 1.000000 // buy
							if( tema > 0.214676 )
								if( VIM <= 0.854646 )
									ret := -0.200000
								if( VIM > 0.854646 )
									ret := 0.745098 // buy
						if( VIM > 1.10016 )
							if( ema1 <= 0.211868 )
								ret := 0.571429
							if( ema1 > 0.211868 )
								ret := -1.000000 // sell
					if( ema1 > 0.217406 )
						if( ema3 <= 0.218285 )
							if( VIM <= 0.8476 )
								if( tema <= 0.222419 )
									ret := -0.750000 // sell
								if( tema > 0.222419 )
									ret := -1.000000 // sell
							if( VIM > 0.8476 )
								if( tema <= 0.224024 )
									ret := -0.483871
								if( tema > 0.224024 )
									ret := 0.666667
						if( ema3 > 0.218285 )
							if( VIP <= 0.943253 )
								if( VIM <= 1.11148 )
									ret := -0.099291
								if( VIM > 1.11148 )
									ret := 0.278481
							if( VIP > 0.943253 )
								if( VIP <= 1.02831 )
									ret := 0.487085
								if( VIP > 1.02831 )
									ret := 0.202429
				if( tema > 0.235424 )
					if( tema <= 0.616214 )
						if( ema12 <= 0.004087 )
							if( ema12 <= 0.000727 )
								if( ema12 <= -0.001041 )
									ret := 0.078394
								if( ema12 > -0.001041 )
									ret := 0.018480
							if( ema12 > 0.000727 )
								if( ema3 <= 0.591388 )
									ret := 0.079258
								if( ema3 > 0.591388 )
									ret := 0.242737
						if( ema12 > 0.004087 )
							if( ema2 <= 0.51086 )
								if( ema1 <= 0.367499 )
									ret := 0.141566
								if( ema1 > 0.367499 )
									ret := -0.216484
							if( ema2 > 0.51086 )
								if( ema3 <= 0.535963 )
									ret := 0.260450
								if( ema3 > 0.535963 )
									ret := -0.050000
					if( tema > 0.616214 )
						if( ema3 <= 0.620622 )
							if( ema1 <= 0.620922 )
								if( VIP_VIM <= 0.494918 )
									ret := -0.115847
								if( VIP_VIM > 0.494918 )
									ret := 0.333333
							if( ema1 > 0.620922 )
								if( VIP <= 1.2326 )
									ret := -0.210526
								if( VIP > 1.2326 )
									ret := -0.716216 // sell
						if( ema3 > 0.620622 )
							if( VIP_VIM <= 0.309511 )
								if( VIP_VIM <= -0.102869 )
									ret := -0.065151
								if( VIP_VIM > -0.102869 )
									ret := 0.052170
							if( VIP_VIM > 0.309511 )
								if( ema1 <= 1.5306 )
									ret := -0.083357
								if( ema1 > 1.5306 )
									ret := 0.550000
		if( ema1 > 1.58383 )
			if( ema13 <= 0.078068 )
				if( ema13 <= 0.001268 )
					if( ema2 <= 1.59956 )
						if( ema1 <= 1.58587 )
							ret := 0.000000
						if( ema1 > 1.58587 )
							if( ema1 <= 1.58714 )
								ret := -1.000000 // sell
							if( ema1 > 1.58714 )
								ret := -0.571429
					if( ema2 > 1.59956 )
						if( ema12 <= -0.001412 )
							if( VIP_VIM <= -0.075878 )
								ret := 0.600000
							if( VIP_VIM > -0.075878 )
								ret := 0.000000
						if( ema12 > -0.001412 )
							if( VIP_VIM <= -0.008665 )
								if( tema <= 1.61477 )
									ret := 1.000000 // buy
								if( tema > 1.61477 )
									ret := 0.500000
							if( VIP_VIM > -0.008665 )
								ret := 1.000000 // buy
				if( ema13 > 0.001268 )
					if( ema3 <= 1.67228 )
						if( VIP_VIM <= 0.345282 )
							if( VIP <= 0.995559 )
								if( VIP_VIM <= -0.06325 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.06325 )
									ret := 0.833333 // buy
							if( VIP > 0.995559 )
								if( ema1 <= 1.5886 )
									ret := -0.566667
								if( ema1 > 1.5886 )
									ret := -0.886228 // sell
						if( VIP_VIM > 0.345282 )
							if( ema1 <= 1.60909 )
								if( VIM <= 0.702495 )
									ret := 1.000000 // buy
								if( VIM > 0.702495 )
									ret := 0.000000
							if( ema1 > 1.60909 )
								if( VIM <= 0.813911 )
									ret := -0.903226 // sell
								if( VIM > 0.813911 )
									ret := 0.400000
					if( ema3 > 1.67228 )
						if( ema13 <= 0.027629 )
							if( ema1 <= 1.7538 )
								if( VIP <= 1.09269 )
									ret := 0.750000 // buy
								if( VIP > 1.09269 )
									ret := 1.000000 // buy
							if( ema1 > 1.7538 )
								if( ema2 <= 1.77834 )
									ret := -0.400000
								if( ema2 > 1.77834 )
									ret := 0.818182 // buy
						if( ema13 > 0.027629 )
							if( ema2 <= 1.75251 )
								if( VIP <= 1.14315 )
									ret := 0.000000
								if( VIP > 1.14315 )
									ret := 0.000000
							if( ema2 > 1.75251 )
								if( ema2 <= 1.81642 )
									ret := -1.000000 // sell
								if( ema2 > 1.81642 )
									ret := -0.750000 // sell
			if( ema13 > 0.078068 )
				if( VIM <= 0.760047 )
					if( tema <= 1.66937 )
						ret := 1.000000 // buy
					if( tema > 1.66937 )
						ret := -0.428571
				if( VIM > 0.760047 )
					ret := 1.000000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_XRPUSDT_30Min_e16e3284(ema2, tema, ema12, ema3, ema1, ema13, VIP_VIM, VIP, VIM)

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


