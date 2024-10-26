//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: AMD_5Min_1BOL_fcf0f333 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_1BOL_fcf0f333", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_fcf0f333(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( dif_source_BBlower <= -1.2437 )
		if( BBupper <= 165.869 )
			if( dif_source_BBupper <= -7.31681 )
				if( BBupper <= 145.168 )
					if( dif_source_BBupper <= -9.79298 )
						if( BBupper <= 124.904 )
							if( dif_source_BBlower <= -2.88745 )
								ret := 0.200000
							if( dif_source_BBlower > -2.88745 )
								if( BBlower <= 104.078 )
									ret := 1.000000 // buy
								if( BBlower > 104.078 )
									ret := -0.945455 // sell
						if( BBupper > 124.904 )
							if( BBlower <= 127.075 )
								if( dif_source_BBlower <= -2.07054 )
									ret := 0.750000 // buy
								if( dif_source_BBlower > -2.07054 )
									ret := 1.000000 // buy
							if( BBlower > 127.075 )
								if( dif_source_BBupper <= -11.8084 )
									ret := 0.250000
								if( dif_source_BBupper > -11.8084 )
									ret := -0.647059
					if( dif_source_BBupper > -9.79298 )
						if( vrsi <= 10.791 )
							if( BBupper <= 138.855 )
								ret := 1.000000 // buy
							if( BBupper > 138.855 )
								ret := 0.750000 // buy
						if( vrsi > 10.791 )
							if( BBupper <= 141.984 )
								if( BBlower <= 126.776 )
									ret := 0.112903
								if( BBlower > 126.776 )
									ret := -0.566667
							if( BBupper > 141.984 )
								ret := 1.000000 // buy
				if( BBupper > 145.168 )
					if( dif_source_BBupper <= -8.76953 )
						if( BBupper <= 149.417 )
							if( BBlower <= 139.964 )
								if( dif_source_BBlower <= -2.43211 )
									ret := -0.555556
								if( dif_source_BBlower > -2.43211 )
									ret := -1.000000 // sell
							if( BBlower > 139.964 )
								if( BBlower <= 140.739 )
									ret := 0.571429
								if( BBlower > 140.739 )
									ret := -0.944444 // sell
						if( BBupper > 149.417 )
							if( vrsi <= 34.3036 )
								if( dif_source_BBupper <= -11.2522 )
									ret := 0.303571
								if( dif_source_BBupper > -11.2522 )
									ret := -0.441558
							if( vrsi > 34.3036 )
								if( dif_source_BBlower <= -1.58769 )
									ret := -0.808511 // sell
								if( dif_source_BBlower > -1.58769 )
									ret := 0.153846
					if( dif_source_BBupper > -8.76953 )
						if( BBlower <= 150.183 )
							if( BBlower <= 144.254 )
								if( BBlower <= 143.454 )
									ret := -1.000000 // sell
								if( BBlower > 143.454 )
									ret := -0.777778 // sell
							if( BBlower > 144.254 )
								ret := 0.500000
						if( BBlower > 150.183 )
							if( BBupper <= 157.017 )
								ret := -0.500000
							if( BBupper > 157.017 )
								ret := -1.000000 // sell
			if( dif_source_BBupper > -7.31681 )
				if( dif_source_BBlower <= -2.61482 )
					if( BBlower <= 146.494 )
						ret := -0.750000 // sell
					if( BBlower > 146.494 )
						if( dif_source_BBlower <= -2.9626 )
							ret := 0.750000 // buy
						if( dif_source_BBlower > -2.9626 )
							ret := 1.000000 // buy
				if( dif_source_BBlower > -2.61482 )
					if( BBupper <= 102.848 )
						if( vrsi <= 17.2944 )
							if( dif_source_BBlower <= -2.10621 )
								ret := -0.500000
							if( dif_source_BBlower > -2.10621 )
								if( dif_source_BBupper <= -5.08338 )
									ret := -0.750000 // sell
								if( dif_source_BBupper > -5.08338 )
									ret := -1.000000 // sell
						if( vrsi > 17.2944 )
							ret := -1.000000 // sell
					if( BBupper > 102.848 )
						if( BBupper <= 164.711 )
							if( BBlower <= 151.491 )
								if( BBupper <= 119.11 )
									ret := 0.261905
								if( BBupper > 119.11 )
									ret := -0.217391
							if( BBlower > 151.491 )
								if( dif_source_BBupper <= -5.5341 )
									ret := 0.771930 // buy
								if( dif_source_BBupper > -5.5341 )
									ret := -0.047619
						if( BBupper > 164.711 )
							if( BBupper <= 165.419 )
								if( vrsi <= 9.62666 )
									ret := -1.000000 // sell
								if( vrsi > 9.62666 )
									ret := -0.200000
							if( BBupper > 165.419 )
								if( dif_source_BBupper <= -5.60381 )
									ret := 0.000000
								if( dif_source_BBupper > -5.60381 )
									ret := 0.250000
		if( BBupper > 165.869 )
			if( dif_source_BBupper <= -8.21557 )
				if( BBupper <= 173.327 )
					if( BBlower <= 159.761 )
						if( dif_source_BBlower <= -2.27506 )
							if( BBlower <= 157.505 )
								if( BBupper <= 167.154 )
									ret := 1.000000 // buy
								if( BBupper > 167.154 )
									ret := 0.875000 // buy
							if( BBlower > 157.505 )
								if( vrsi <= 22.0904 )
									ret := 1.000000 // buy
								if( vrsi > 22.0904 )
									ret := 0.333333
						if( dif_source_BBlower > -2.27506 )
							if( BBlower <= 158.635 )
								if( BBlower <= 157.408 )
									ret := 0.750000 // buy
								if( BBlower > 157.408 )
									ret := 0.285714
							if( BBlower > 158.635 )
								ret := -1.000000 // sell
					if( BBlower > 159.761 )
						if( dif_source_BBlower <= -1.51739 )
							if( dif_source_BBlower <= -2.40799 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -2.40799 )
								if( dif_source_BBupper <= -10.8085 )
									ret := 0.750000 // buy
								if( dif_source_BBupper > -10.8085 )
									ret := 0.875000 // buy
						if( dif_source_BBlower > -1.51739 )
							ret := 1.000000 // buy
				if( BBupper > 173.327 )
					if( vrsi <= 20.6777 )
						if( vrsi <= 16.591 )
							if( dif_source_BBlower <= -2.8849 )
								if( BBlower <= 175.928 )
									ret := 0.234043
								if( BBlower > 175.928 )
									ret := 0.964286 // buy
							if( dif_source_BBlower > -2.8849 )
								if( dif_source_BBupper <= -12.0302 )
									ret := 0.428571
								if( dif_source_BBupper > -12.0302 )
									ret := -0.297619
						if( vrsi > 16.591 )
							if( dif_source_BBlower <= -1.61772 )
								if( BBupper <= 182.048 )
									ret := 0.428571
								if( BBupper > 182.048 )
									ret := 0.903226 // buy
							if( dif_source_BBlower > -1.61772 )
								if( dif_source_BBlower <= -1.33944 )
									ret := 0.000000
								if( dif_source_BBlower > -1.33944 )
									ret := 1.000000 // buy
					if( vrsi > 20.6777 )
						if( BBlower <= 165.096 )
							if( dif_source_BBlower <= -2.36968 )
								ret := 0.250000
							if( dif_source_BBlower > -2.36968 )
								if( dif_source_BBlower <= -2.09074 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > -2.09074 )
									ret := 0.733333 // buy
						if( BBlower > 165.096 )
							if( BBlower <= 175.262 )
								if( BBupper <= 178.812 )
									ret := 0.000000
								if( BBupper > 178.812 )
									ret := -0.576000
							if( BBlower > 175.262 )
								if( vrsi <= 59.0292 )
									ret := 0.305263
								if( vrsi > 59.0292 )
									ret := -0.733333 // sell
			if( dif_source_BBupper > -8.21557 )
				if( BBlower <= 165.242 )
					if( BBupper <= 166.907 )
						if( BBlower <= 161.355 )
							ret := 1.000000 // buy
						if( BBlower > 161.355 )
							ret := 0.750000 // buy
					if( BBupper > 166.907 )
						if( dif_source_BBlower <= -1.30854 )
							ret := 0.200000
						if( dif_source_BBlower > -1.30854 )
							ret := 0.500000
				if( BBlower > 165.242 )
					if( vrsi <= 7.75754 )
						if( vrsi <= 1.26045 )
							if( dif_source_BBlower <= -2.48809 )
								ret := -0.750000 // sell
							if( dif_source_BBlower > -2.48809 )
								ret := -1.000000 // sell
						if( vrsi > 1.26045 )
							if( dif_source_BBlower <= -1.4713 )
								if( BBlower <= 174.949 )
									ret := -0.764706 // sell
								if( BBlower > 174.949 )
									ret := -0.181818
							if( dif_source_BBlower > -1.4713 )
								ret := -1.000000 // sell
					if( vrsi > 7.75754 )
						if( BBupper <= 185.404 )
							if( dif_source_BBupper <= -5.63756 )
								if( BBlower <= 177.541 )
									ret := -0.092593
								if( BBlower > 177.541 )
									ret := -0.900000 // sell
							if( dif_source_BBupper > -5.63756 )
								if( dif_source_BBupper <= -4.69102 )
									ret := 0.473684
								if( dif_source_BBupper > -4.69102 )
									ret := -1.000000 // sell
						if( BBupper > 185.404 )
							if( BBlower <= 186.129 )
								if( vrsi <= 18.5236 )
									ret := 1.000000 // buy
								if( vrsi > 18.5236 )
									ret := 0.250000
							if( BBlower > 186.129 )
								ret := -0.714286 // sell
	if( dif_source_BBlower > -1.2437 )
		if( BBlower <= 176.407 )
			if( dif_source_BBupper <= 0.789412 )
				if( vrsi <= 1.06088 )
					if( vrsi <= 0.106879 )
						if( BBlower <= 103.321 )
							if( dif_source_BBupper <= -2.31796 )
								if( BBlower <= 94.5827 )
									ret := 0.000000
								if( BBlower > 94.5827 )
									ret := 0.781250 // buy
							if( dif_source_BBupper > -2.31796 )
								if( BBlower <= 95.359 )
									ret := 0.555556
								if( BBlower > 95.359 )
									ret := 0.000000
						if( BBlower > 103.321 )
							if( dif_source_BBlower <= 1.25995 )
								if( dif_source_BBlower <= -0.341996 )
									ret := 0.283582
								if( dif_source_BBlower > -0.341996 )
									ret := -0.204255
							if( dif_source_BBlower > 1.25995 )
								if( BBupper <= 179.744 )
									ret := 0.151786
								if( BBupper > 179.744 )
									ret := 0.789474 // buy
					if( vrsi > 0.106879 )
						if( BBlower <= 129.37 )
							if( BBupper <= 119.229 )
								if( dif_source_BBupper <= -4.71645 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -4.71645 )
									ret := 0.114286
							if( BBupper > 119.229 )
								if( dif_source_BBupper <= -8.85708 )
									ret := 0.125000
								if( dif_source_BBupper > -8.85708 )
									ret := -0.631579
						if( BBlower > 129.37 )
							if( dif_source_BBlower <= 0.708326 )
								if( BBupper <= 157.072 )
									ret := -0.176471
								if( BBupper > 157.072 )
									ret := 0.782609 // buy
							if( dif_source_BBlower > 0.708326 )
								if( BBupper <= 172.808 )
									ret := 0.878378 // buy
								if( BBupper > 172.808 )
									ret := -0.142857
				if( vrsi > 1.06088 )
					if( BBupper <= 193.133 )
						if( dif_source_BBlower <= 1.82879 )
							if( BBupper <= 157.287 )
								if( BBupper <= 97.7378 )
									ret := 0.200282
								if( BBupper > 97.7378 )
									ret := 0.035828
							if( BBupper > 157.287 )
								if( dif_source_BBupper <= -17.0628 )
									ret := -0.344262
								if( dif_source_BBupper > -17.0628 )
									ret := 0.155884
						if( dif_source_BBlower > 1.82879 )
							if( BBlower <= 163.81 )
								if( BBlower <= 80.6409 )
									ret := -0.252788
								if( BBlower > 80.6409 )
									ret := 0.044691
							if( BBlower > 163.81 )
								if( dif_source_BBupper <= -0.615058 )
									ret := -0.007890
								if( dif_source_BBupper > -0.615058 )
									ret := -0.138326
					if( BBupper > 193.133 )
						if( dif_source_BBlower <= 26.7186 )
							if( dif_source_BBupper <= -3.04612 )
								if( BBlower <= 169.45 )
									ret := 0.000000
								if( BBlower > 169.45 )
									ret := 0.580000
							if( dif_source_BBupper > -3.04612 )
								if( vrsi <= 69.6412 )
									ret := 0.750000 // buy
								if( vrsi > 69.6412 )
									ret := 1.000000 // buy
						if( dif_source_BBlower > 26.7186 )
							if( vrsi <= 64.4785 )
								ret := 0.000000
							if( vrsi > 64.4785 )
								if( BBlower <= 170.237 )
									ret := -0.833333 // sell
								if( BBlower > 170.237 )
									ret := -0.571429
			if( dif_source_BBupper > 0.789412 )
				if( BBlower <= 79.4198 )
					if( vrsi <= 28.2679 )
						if( vrsi <= 26.6659 )
							ret := -0.500000
						if( vrsi > 26.6659 )
							ret := 1.000000 // buy
					if( vrsi > 28.2679 )
						if( BBupper <= 85.4925 )
							ret := -0.750000 // sell
						if( BBupper > 85.4925 )
							ret := -1.000000 // sell
				if( BBlower > 79.4198 )
					if( BBlower <= 101.189 )
						if( BBupper <= 93.3339 )
							if( dif_source_BBlower <= 8.98761 )
								if( vrsi <= 98.8685 )
									ret := 1.000000 // buy
								if( vrsi > 98.8685 )
									ret := 0.700000 // buy
							if( dif_source_BBlower > 8.98761 )
								ret := 0.500000
						if( BBupper > 93.3339 )
							if( BBlower <= 93.6056 )
								if( BBupper <= 102.778 )
									ret := -0.241379
								if( BBupper > 102.778 )
									ret := 0.470588
							if( BBlower > 93.6056 )
								if( BBupper <= 101.326 )
									ret := 0.775000 // buy
								if( BBupper > 101.326 )
									ret := 0.277778
					if( BBlower > 101.189 )
						if( BBlower <= 111.239 )
							if( dif_source_BBupper <= 0.822095 )
								if( vrsi <= 79.0537 )
									ret := -0.142857
								if( vrsi > 79.0537 )
									ret := 0.785714 // buy
							if( dif_source_BBupper > 0.822095 )
								if( dif_source_BBupper <= 3.50867 )
									ret := -0.333333
								if( dif_source_BBupper > 3.50867 )
									ret := 0.428571
						if( BBlower > 111.239 )
							if( BBlower <= 137.104 )
								if( BBupper <= 140.992 )
									ret := 0.247227
								if( BBupper > 140.992 )
									ret := 0.632530
							if( BBlower > 137.104 )
								if( dif_source_BBupper <= 3.21941 )
									ret := 0.090749
								if( dif_source_BBupper > 3.21941 )
									ret := 0.452229
		if( BBlower > 176.407 )
			if( BBupper <= 196.685 )
				if( BBupper <= 182.925 )
					if( vrsi <= 48.1067 )
						if( dif_source_BBupper <= -2.25611 )
							if( BBlower <= 177.519 )
								if( vrsi <= 15.2789 )
									ret := 0.708333 // buy
								if( vrsi > 15.2789 )
									ret := 0.183908
							if( BBlower > 177.519 )
								if( BBupper <= 182.697 )
									ret := 1.000000 // buy
								if( BBupper > 182.697 )
									ret := 0.666667
						if( dif_source_BBupper > -2.25611 )
							if( dif_source_BBlower <= 2.60258 )
								if( dif_source_BBlower <= 2.5022 )
									ret := -0.033898
								if( dif_source_BBlower > 2.5022 )
									ret := -0.500000
							if( dif_source_BBlower > 2.60258 )
								if( BBlower <= 176.626 )
									ret := 0.611111
								if( BBlower > 176.626 )
									ret := 0.090909
					if( vrsi > 48.1067 )
						if( dif_source_BBlower <= 5.54601 )
							if( BBupper <= 180.346 )
								if( dif_source_BBlower <= 1.6547 )
									ret := 1.000000 // buy
								if( dif_source_BBlower > 1.6547 )
									ret := 0.080000
							if( BBupper > 180.346 )
								if( vrsi <= 98.9653 )
									ret := -0.182857
								if( vrsi > 98.9653 )
									ret := -1.000000 // sell
						if( dif_source_BBlower > 5.54601 )
							ret := -1.000000 // sell
				if( BBupper > 182.925 )
					if( BBupper <= 183.815 )
						if( BBlower <= 177.679 )
							if( vrsi <= 46.4936 )
								if( vrsi <= 25.5692 )
									ret := -0.361111
								if( vrsi > 25.5692 )
									ret := 0.500000
							if( vrsi > 46.4936 )
								if( vrsi <= 62.4467 )
									ret := -0.758621 // sell
								if( vrsi > 62.4467 )
									ret := -0.066667
						if( BBlower > 177.679 )
							if( BBlower <= 178.2 )
								if( vrsi <= 73.3997 )
									ret := -0.838235 // sell
								if( vrsi > 73.3997 )
									ret := 0.500000
							if( BBlower > 178.2 )
								if( BBlower <= 178.66 )
									ret := -0.394958
								if( BBlower > 178.66 )
									ret := 0.750000 // buy
					if( BBupper > 183.815 )
						if( BBupper <= 195.308 )
							if( dif_source_BBlower <= 1.74081 )
								if( BBupper <= 186.103 )
									ret := -0.410920
								if( BBupper > 186.103 )
									ret := 0.122066
							if( dif_source_BBlower > 1.74081 )
								if( dif_source_BBlower <= 8.90147 )
									ret := 0.024248
								if( dif_source_BBlower > 8.90147 )
									ret := -0.480000
						if( BBupper > 195.308 )
							if( dif_source_BBlower <= -0.046483 )
								if( vrsi <= 53.8454 )
									ret := 0.372093
								if( vrsi > 53.8454 )
									ret := -0.800000 // sell
							if( dif_source_BBlower > -0.046483 )
								if( vrsi <= 92.5836 )
									ret := -0.338843
								if( vrsi > 92.5836 )
									ret := -0.909091 // sell
			if( BBupper > 196.685 )
				if( BBupper <= 204.347 )
					if( dif_source_BBlower <= 18.9785 )
						if( vrsi <= 92.2688 )
							if( dif_source_BBupper <= -1.23596 )
								if( vrsi <= 76.0669 )
									ret := 0.463470
								if( vrsi > 76.0669 )
									ret := -0.153846
							if( dif_source_BBupper > -1.23596 )
								if( BBlower <= 195.95 )
									ret := -0.500000
								if( BBlower > 195.95 )
									ret := 0.081395
						if( vrsi > 92.2688 )
							if( dif_source_BBlower <= 4.35669 )
								ret := -1.000000 // sell
							if( dif_source_BBlower > 4.35669 )
								if( BBlower <= 187.52 )
									ret := 0.000000
								if( BBlower > 187.52 )
									ret := -0.500000
					if( dif_source_BBlower > 18.9785 )
						if( dif_source_BBupper <= -5.73018 )
							ret := 0.000000
						if( dif_source_BBupper > -5.73018 )
							ret := -1.000000 // sell
				if( BBupper > 204.347 )
					if( BBlower <= 208.881 )
						if( vrsi <= 96.404 )
							if( dif_source_BBlower <= 2.4226 )
								if( BBlower <= 201.231 )
									ret := 0.098765
								if( BBlower > 201.231 )
									ret := 0.663717
							if( dif_source_BBlower > 2.4226 )
								if( dif_source_BBupper <= 1.85501 )
									ret := -0.133852
								if( dif_source_BBupper > 1.85501 )
									ret := -0.935484 // sell
						if( vrsi > 96.404 )
							if( dif_source_BBlower <= 7.04972 )
								if( dif_source_BBupper <= -5.75601 )
									ret := 0.555556
								if( dif_source_BBupper > -5.75601 )
									ret := -0.875000 // sell
							if( dif_source_BBlower > 7.04972 )
								if( dif_source_BBupper <= -1.79323 )
									ret := 1.000000 // buy
								if( dif_source_BBupper > -1.79323 )
									ret := 0.857143 // buy
					if( BBlower > 208.881 )
						if( dif_source_BBlower <= 2.17872 )
							if( dif_source_BBlower <= 1.0688 )
								if( dif_source_BBupper <= -3.29907 )
									ret := 0.714286 // buy
								if( dif_source_BBupper > -3.29907 )
									ret := -0.800000 // sell
							if( dif_source_BBlower > 1.0688 )
								if( BBupper <= 213.228 )
									ret := 1.000000 // buy
								if( BBupper > 213.228 )
									ret := 0.484848
						if( dif_source_BBlower > 2.17872 )
							if( BBupper <= 213.308 )
								if( dif_source_BBlower <= 2.51002 )
									ret := 0.142857
								if( dif_source_BBlower > 2.51002 )
									ret := -0.482759
							if( BBupper > 213.308 )
								if( vrsi <= 43.1048 )
									ret := -0.352941
								if( vrsi > 43.1048 )
									ret := 0.554054
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_AMD_5Min_fcf0f333(BBupper, crossunder_rsi_bbupperInt, dif_source_BBlower, BBlower, vrsi, dif_source_BBupper, crossover_rsi_bblowerInt)

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


