//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index
// ID_model: BABA_30Min_1M00_682ef475 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BABA_30Min_1M00_682ef475", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BABA_30Min_682ef475(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow_Sum <= 8.16341e+08 )
		if( Typical_Price <= 189.475 )
			if( Negative_Money_Flow <= 2.10526e+08 )
				if( Positive_Money_Flow_Sum <= 1.15006e+07 )
					if( Typical_Price <= 66.4833 )
						if( MFI_High <= -18.0113 )
							if( Raw_Money_Flow <= 289765 )
								ret := -0.666667
							if( Raw_Money_Flow > 289765 )
								if( Positive_Money_Flow_Sum <= 4.39514e+06 )
									ret := 0.829787 // buy
								if( Positive_Money_Flow_Sum > 4.39514e+06 )
									ret := 0.333333
						if( MFI_High > -18.0113 )
							ret := -0.500000
					if( Typical_Price > 66.4833 )
						if( Negative_Money_Flow_Sum <= 6.62901e+06 )
							if( Money_Flow_Ratio <= 2.16748 )
								if( Raw_Money_Flow <= 922265 )
									ret := -0.073171
								if( Raw_Money_Flow > 922265 )
									ret := 0.208054
							if( Money_Flow_Ratio > 2.16748 )
								if( Positive_Money_Flow_Sum <= 3.22173e+06 )
									ret := 0.323529
								if( Positive_Money_Flow_Sum > 3.22173e+06 )
									ret := -0.179558
						if( Negative_Money_Flow_Sum > 6.62901e+06 )
							if( Negative_Money_Flow_Sum <= 5.43391e+07 )
								if( Negative_Money_Flow_Sum <= 6.84297e+06 )
									ret := -0.612903
								if( Negative_Money_Flow_Sum > 6.84297e+06 )
									ret := -0.092978
							if( Negative_Money_Flow_Sum > 5.43391e+07 )
								if( Typical_Price <= 171.821 )
									ret := 0.066869
								if( Typical_Price > 171.821 )
									ret := -0.140411
				if( Positive_Money_Flow_Sum > 1.15006e+07 )
					if( Raw_Money_Flow <= 2.14698e+07 )
						if( Positive_Money_Flow_Sum <= 1.14329e+08 )
							if( MFI_Low <= -9.00872 )
								if( Raw_Money_Flow <= 3.20639e+06 )
									ret := -0.122596
								if( Raw_Money_Flow > 3.20639e+06 )
									ret := 0.149533
							if( MFI_Low > -9.00872 )
								if( Negative_Money_Flow_Sum <= 2.39702e+07 )
									ret := 0.086907
								if( Negative_Money_Flow_Sum > 2.39702e+07 )
									ret := 0.185129
						if( Positive_Money_Flow_Sum > 1.14329e+08 )
							if( Positive_Money_Flow_Sum <= 1.30782e+09 )
								if( Negative_Money_Flow <= 605.355 )
									ret := 0.013829
								if( Negative_Money_Flow > 605.355 )
									ret := 0.090206
							if( Positive_Money_Flow_Sum > 1.30782e+09 )
								if( Positive_Money_Flow_Sum <= 1.37766e+09 )
									ret := 0.529851
								if( Positive_Money_Flow_Sum > 1.37766e+09 )
									ret := 0.141570
					if( Raw_Money_Flow > 2.14698e+07 )
						if( MFI_Low <= 76.6903 )
							if( MFI_High <= -75.4532 )
								if( MFI_High <= -77.376 )
									ret := 0.054795
								if( MFI_High > -77.376 )
									ret := -0.412162
							if( MFI_High > -75.4532 )
								if( Negative_Money_Flow_Sum <= 3.55572e+07 )
									ret := -0.082292
								if( Negative_Money_Flow_Sum > 3.55572e+07 )
									ret := 0.025457
						if( MFI_Low > 76.6903 )
							if( Positive_Money_Flow_Sum <= 1.95682e+09 )
								if( Raw_Money_Flow <= 1.17966e+09 )
									ret := 0.112458
								if( Raw_Money_Flow > 1.17966e+09 )
									ret := -0.846154 // sell
							if( Positive_Money_Flow_Sum > 1.95682e+09 )
								if( Raw_Money_Flow <= 7.16802e+08 )
									ret := 0.508197
								if( Raw_Money_Flow > 7.16802e+08 )
									ret := -0.428571
			if( Negative_Money_Flow > 2.10526e+08 )
				if( Raw_Money_Flow <= 5.25699e+08 )
					if( MFI <= 10.4658 )
						if( Negative_Money_Flow <= 4.23188e+08 )
							if( Negative_Money_Flow <= 3.48129e+08 )
								if( Raw_Money_Flow <= 2.36557e+08 )
									ret := -0.446667
								if( Raw_Money_Flow > 2.36557e+08 )
									ret := -0.198113
							if( Negative_Money_Flow > 3.48129e+08 )
								if( Negative_Money_Flow_Sum <= 3.72929e+08 )
									ret := 0.625000
								if( Negative_Money_Flow_Sum > 3.72929e+08 )
									ret := 0.008130
						if( Negative_Money_Flow > 4.23188e+08 )
							if( Raw_Money_Flow <= 4.68991e+08 )
								if( MFI_High <= -79.1041 )
									ret := -0.200000
								if( MFI_High > -79.1041 )
									ret := -0.837838 // sell
							if( Raw_Money_Flow > 4.68991e+08 )
								if( Negative_Money_Flow <= 4.79741e+08 )
									ret := 0.625000
								if( Negative_Money_Flow > 4.79741e+08 )
									ret := -0.608696
					if( MFI > 10.4658 )
						if( Raw_Money_Flow <= 3.04872e+08 )
							if( Positive_Money_Flow_Sum <= 5.2416e+07 )
								if( MFI_Low <= -7.7292 )
									ret := 0.250000
								if( MFI_Low > -7.7292 )
									ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 5.2416e+07 )
								if( Negative_Money_Flow_Sum <= 6.08642e+08 )
									ret := -0.198606
								if( Negative_Money_Flow_Sum > 6.08642e+08 )
									ret := 0.205882
						if( Raw_Money_Flow > 3.04872e+08 )
							if( Money_Flow_Ratio <= 3.83364 )
								if( Negative_Money_Flow_Sum <= 6.2825e+08 )
									ret := 0.114504
								if( Negative_Money_Flow_Sum > 6.2825e+08 )
									ret := 0.605263
							if( Money_Flow_Ratio > 3.83364 )
								if( Money_Flow_Ratio <= 4.09291 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 4.09291 )
									ret := 0.000000
				if( Raw_Money_Flow > 5.25699e+08 )
					if( Negative_Money_Flow_Sum <= 5.83146e+08 )
						if( Typical_Price <= 170.715 )
							if( MFI_High <= -77.6373 )
								ret := 0.500000
							if( MFI_High > -77.6373 )
								if( Negative_Money_Flow <= 5.34019e+08 )
									ret := 0.750000 // buy
								if( Negative_Money_Flow > 5.34019e+08 )
									ret := 0.961538 // buy
						if( Typical_Price > 170.715 )
							if( Negative_Money_Flow_Sum <= 5.58818e+08 )
								ret := -0.166667
							if( Negative_Money_Flow_Sum > 5.58818e+08 )
								ret := 0.714286 // buy
					if( Negative_Money_Flow_Sum > 5.83146e+08 )
						if( Negative_Money_Flow <= 6.5709e+08 )
							if( Raw_Money_Flow <= 5.97961e+08 )
								if( Raw_Money_Flow <= 5.46048e+08 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 5.46048e+08 )
									ret := -0.172414
							if( Raw_Money_Flow > 5.97961e+08 )
								if( MFI_Low <= -13.4428 )
									ret := 0.638889
								if( MFI_Low > -13.4428 )
									ret := -0.333333
						if( Negative_Money_Flow > 6.5709e+08 )
							if( Negative_Money_Flow <= 7.39317e+08 )
								if( MFI <= 12.0153 )
									ret := -0.571429
								if( MFI > 12.0153 )
									ret := 0.400000
							if( Negative_Money_Flow > 7.39317e+08 )
								if( Negative_Money_Flow_Sum <= 7.83e+08 )
									ret := -0.300000
								if( Negative_Money_Flow_Sum > 7.83e+08 )
									ret := 0.846154 // buy
		if( Typical_Price > 189.475 )
			if( Negative_Money_Flow_Sum <= 5.32117e+07 )
				if( Negative_Money_Flow_Sum <= 1.87749e+07 )
					if( MFI_Low <= 18.8795 )
						if( Raw_Money_Flow <= 2.41477e+06 )
							if( Positive_Money_Flow_Sum <= 7.16618e+06 )
								if( Positive_Money_Flow_Sum <= 5.0635e+06 )
									ret := -0.208333
								if( Positive_Money_Flow_Sum > 5.0635e+06 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 7.16618e+06 )
								ret := -0.833333 // sell
						if( Raw_Money_Flow > 2.41477e+06 )
							if( Negative_Money_Flow_Sum <= 1.38346e+07 )
								if( Negative_Money_Flow <= 4.23022e+06 )
									ret := 0.764706 // buy
								if( Negative_Money_Flow > 4.23022e+06 )
									ret := 0.200000
							if( Negative_Money_Flow_Sum > 1.38346e+07 )
								if( Negative_Money_Flow_Sum <= 1.61831e+07 )
									ret := -0.153846
								if( Negative_Money_Flow_Sum > 1.61831e+07 )
									ret := 0.517241
					if( MFI_Low > 18.8795 )
						if( Raw_Money_Flow <= 3.9862e+06 )
							if( Positive_Money_Flow <= 3.24759e+06 )
								if( Raw_Money_Flow <= 2.66187e+06 )
									ret := -0.148000
								if( Raw_Money_Flow > 2.66187e+06 )
									ret := 0.095238
							if( Positive_Money_Flow > 3.24759e+06 )
								if( MFI_Low <= 62.354 )
									ret := -0.658537
								if( MFI_Low > 62.354 )
									ret := 0.062500
						if( Raw_Money_Flow > 3.9862e+06 )
							if( Raw_Money_Flow <= 6.40801e+08 )
								if( Raw_Money_Flow <= 3.07509e+08 )
									ret := 0.005556
								if( Raw_Money_Flow > 3.07509e+08 )
									ret := 0.280000
							if( Raw_Money_Flow > 6.40801e+08 )
								if( Raw_Money_Flow <= 7.91077e+08 )
									ret := -0.875000 // sell
								if( Raw_Money_Flow > 7.91077e+08 )
									ret := 0.285714
				if( Negative_Money_Flow_Sum > 1.87749e+07 )
					if( Typical_Price <= 246.144 )
						if( Negative_Money_Flow_Sum <= 5.11383e+07 )
							if( Negative_Money_Flow <= 1.18511e+07 )
								if( MFI_High <= -61.3321 )
									ret := 0.314286
								if( MFI_High > -61.3321 )
									ret := -0.198381
							if( Negative_Money_Flow > 1.18511e+07 )
								if( Money_Flow_Ratio <= 1.17807 )
									ret := -0.107143
								if( Money_Flow_Ratio > 1.17807 )
									ret := 0.736842 // buy
						if( Negative_Money_Flow_Sum > 5.11383e+07 )
							if( Negative_Money_Flow <= 2.29936e+07 )
								if( Raw_Money_Flow <= 1.50067e+07 )
									ret := -0.444444
								if( Raw_Money_Flow > 1.50067e+07 )
									ret := -0.913043 // sell
							if( Negative_Money_Flow > 2.29936e+07 )
								ret := 0.250000
					if( Typical_Price > 246.144 )
						if( Positive_Money_Flow <= 1.76191e+07 )
							if( Raw_Money_Flow <= 2.32857e+07 )
								if( MFI <= 37.6557 )
									ret := -0.025974
								if( MFI > 37.6557 )
									ret := -0.385135
							if( Raw_Money_Flow > 2.32857e+07 )
								if( MFI_High <= -45.5825 )
									ret := -1.000000 // sell
								if( MFI_High > -45.5825 )
									ret := -0.200000
						if( Positive_Money_Flow > 1.76191e+07 )
							if( Positive_Money_Flow_Sum <= 1.08898e+09 )
								if( MFI_High <= -18.5376 )
									ret := 0.000000
								if( MFI_High > -18.5376 )
									ret := -0.784091 // sell
							if( Positive_Money_Flow_Sum > 1.08898e+09 )
								if( Positive_Money_Flow_Sum <= 1.56755e+09 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 1.56755e+09 )
									ret := -0.333333
			if( Negative_Money_Flow_Sum > 5.32117e+07 )
				if( MFI <= 97.4159 )
					if( Positive_Money_Flow_Sum <= 5.10906e+06 )
						if( Positive_Money_Flow_Sum <= 2.2189e+06 )
							if( Positive_Money_Flow_Sum <= 1.5784e+06 )
								if( MFI_Low <= -19.7473 )
									ret := -0.250000
								if( MFI_Low > -19.7473 )
									ret := 0.000000
							if( Positive_Money_Flow_Sum > 1.5784e+06 )
								if( Typical_Price <= 206.138 )
									ret := 1.000000 // buy
								if( Typical_Price > 206.138 )
									ret := 0.166667
						if( Positive_Money_Flow_Sum > 2.2189e+06 )
							if( Typical_Price <= 211.165 )
								if( Positive_Money_Flow_Sum <= 4.34576e+06 )
									ret := 0.000000
								if( Positive_Money_Flow_Sum > 4.34576e+06 )
									ret := -0.545455
							if( Typical_Price > 211.165 )
								if( Negative_Money_Flow_Sum <= 6.82671e+08 )
									ret := -0.657143
								if( Negative_Money_Flow_Sum > 6.82671e+08 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 5.10906e+06 )
						if( Negative_Money_Flow_Sum <= 6.30106e+08 )
							if( Negative_Money_Flow <= 3.91122e+08 )
								if( Negative_Money_Flow <= 2.8575e+08 )
									ret := -0.040868
								if( Negative_Money_Flow > 2.8575e+08 )
									ret := 0.333333
							if( Negative_Money_Flow > 3.91122e+08 )
								if( MFI <= 81.2808 )
									ret := -0.312500
								if( MFI > 81.2808 )
									ret := 0.875000 // buy
						if( Negative_Money_Flow_Sum > 6.30106e+08 )
							if( Negative_Money_Flow_Sum <= 7.22033e+08 )
								if( Negative_Money_Flow <= 1.39909e+06 )
									ret := 0.217786
								if( Negative_Money_Flow > 1.39909e+06 )
									ret := -0.030928
							if( Negative_Money_Flow_Sum > 7.22033e+08 )
								if( Positive_Money_Flow_Sum <= 2.24383e+09 )
									ret := -0.026239
								if( Positive_Money_Flow_Sum > 2.24383e+09 )
									ret := -0.690476
				if( MFI > 97.4159 )
					if( Negative_Money_Flow_Sum <= 9.54882e+07 )
						if( MFI <= 98.0922 )
							ret := 1.000000 // buy
						if( MFI > 98.0922 )
							ret := 0.500000
					if( Negative_Money_Flow_Sum > 9.54882e+07 )
						ret := 0.000000
	if( Negative_Money_Flow_Sum > 8.16341e+08 )
		if( Raw_Money_Flow <= 1.9411e+08 )
			if( Money_Flow_Ratio <= 1.46876 )
				if( Negative_Money_Flow_Sum <= 1.4148e+09 )
					if( Typical_Price <= 69.53 )
						if( Typical_Price <= 66.9266 )
							if( Negative_Money_Flow <= 4.79056e+07 )
								if( MFI <= 27.3036 )
									ret := -0.500000
								if( MFI > 27.3036 )
									ret := 0.000000
							if( Negative_Money_Flow > 4.79056e+07 )
								ret := -0.600000
						if( Typical_Price > 66.9266 )
							if( Positive_Money_Flow_Sum <= 1.87544e+08 )
								ret := -0.166667
							if( Positive_Money_Flow_Sum > 1.87544e+08 )
								if( Money_Flow_Ratio <= 0.343254 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 0.343254 )
									ret := -1.000000 // sell
					if( Typical_Price > 69.53 )
						if( Money_Flow_Ratio <= 1.38787 )
							if( Raw_Money_Flow <= 1.26081e+06 )
								if( Negative_Money_Flow <= 768174 )
									ret := 0.092799
								if( Negative_Money_Flow > 768174 )
									ret := 0.288288
							if( Raw_Money_Flow > 1.26081e+06 )
								if( MFI <= 55.216 )
									ret := 0.047768
								if( MFI > 55.216 )
									ret := 0.167857
						if( Money_Flow_Ratio > 1.38787 )
							if( Typical_Price <= 111.995 )
								if( Positive_Money_Flow <= 5.73251e+07 )
									ret := 0.166667
								if( Positive_Money_Flow > 5.73251e+07 )
									ret := 1.000000 // buy
							if( Typical_Price > 111.995 )
								if( Positive_Money_Flow_Sum <= 1.8235e+09 )
									ret := -0.213115
								if( Positive_Money_Flow_Sum > 1.8235e+09 )
									ret := -0.888889 // sell
				if( Negative_Money_Flow_Sum > 1.4148e+09 )
					if( Negative_Money_Flow_Sum <= 1.18725e+10 )
						if( Typical_Price <= 222.324 )
							if( Negative_Money_Flow <= 2877.69 )
								if( Typical_Price <= 204.471 )
									ret := 0.086229
								if( Typical_Price > 204.471 )
									ret := -0.135246
							if( Negative_Money_Flow > 2877.69 )
								if( MFI_Low <= 15.465 )
									ret := 0.224621
								if( MFI_Low > 15.465 )
									ret := 0.018571
						if( Typical_Price > 222.324 )
							if( Negative_Money_Flow_Sum <= 2.31639e+09 )
								if( Raw_Money_Flow <= 1.11495e+06 )
									ret := 0.575163
								if( Raw_Money_Flow > 1.11495e+06 )
									ret := 0.277159
							if( Negative_Money_Flow_Sum > 2.31639e+09 )
								if( MFI_Low <= 35.2632 )
									ret := 0.000000
								if( MFI_Low > 35.2632 )
									ret := 0.904762 // buy
					if( Negative_Money_Flow_Sum > 1.18725e+10 )
						if( Positive_Money_Flow_Sum <= 1.05582e+10 )
							ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.05582e+10 )
							ret := -1.000000 // sell
			if( Money_Flow_Ratio > 1.46876 )
				if( Raw_Money_Flow <= 7.63044e+06 )
					if( Negative_Money_Flow_Sum <= 8.24981e+08 )
						if( Typical_Price <= 175.328 )
							ret := 1.000000 // buy
						if( Typical_Price > 175.328 )
							if( Negative_Money_Flow_Sum <= 8.18033e+08 )
								ret := 0.800000 // buy
							if( Negative_Money_Flow_Sum > 8.18033e+08 )
								ret := 0.428571
					if( Negative_Money_Flow_Sum > 8.24981e+08 )
						if( Positive_Money_Flow_Sum <= 4.37187e+09 )
							if( Positive_Money_Flow_Sum <= 3.68001e+09 )
								if( Typical_Price <= 233.922 )
									ret := 0.211970
								if( Typical_Price > 233.922 )
									ret := -0.097345
							if( Positive_Money_Flow_Sum > 3.68001e+09 )
								if( Typical_Price <= 187.359 )
									ret := -0.785714 // sell
								if( Typical_Price > 187.359 )
									ret := 0.250000
						if( Positive_Money_Flow_Sum > 4.37187e+09 )
							if( Typical_Price <= 158.508 )
								if( Positive_Money_Flow <= 3.0173e+06 )
									ret := 0.000000
								if( Positive_Money_Flow > 3.0173e+06 )
									ret := -0.750000 // sell
							if( Typical_Price > 158.508 )
								if( MFI <= 82.559 )
									ret := 0.806452 // buy
								if( MFI > 82.559 )
									ret := 0.400000
				if( Raw_Money_Flow > 7.63044e+06 )
					if( Typical_Price <= 95.9908 )
						if( Raw_Money_Flow <= 1.70103e+08 )
							if( Typical_Price <= 74.7446 )
								ret := 0.200000
							if( Typical_Price > 74.7446 )
								if( MFI_Low <= 44.4618 )
									ret := 0.500000
								if( MFI_Low > 44.4618 )
									ret := 0.909091 // buy
						if( Raw_Money_Flow > 1.70103e+08 )
							ret := -0.500000
					if( Typical_Price > 95.9908 )
						if( Typical_Price <= 102.466 )
							if( Positive_Money_Flow_Sum <= 2.68597e+09 )
								if( Positive_Money_Flow_Sum <= 1.93002e+09 )
									ret := 0.142857
								if( Positive_Money_Flow_Sum > 1.93002e+09 )
									ret := 0.571429
							if( Positive_Money_Flow_Sum > 2.68597e+09 )
								if( MFI <= 79.4975 )
									ret := -0.666667
								if( MFI > 79.4975 )
									ret := 0.000000
						if( Typical_Price > 102.466 )
							if( Positive_Money_Flow_Sum <= 4.21462e+09 )
								if( Typical_Price <= 213.21 )
									ret := 0.403651
								if( Typical_Price > 213.21 )
									ret := 0.008929
							if( Positive_Money_Flow_Sum > 4.21462e+09 )
								if( Typical_Price <= 136.193 )
									ret := -0.545455
								if( Typical_Price > 136.193 )
									ret := 0.891892 // buy
		if( Raw_Money_Flow > 1.9411e+08 )
			if( Raw_Money_Flow <= 4.31745e+08 )
				if( Positive_Money_Flow_Sum <= 1.58515e+09 )
					if( Positive_Money_Flow_Sum <= 1.45849e+07 )
						if( Raw_Money_Flow <= 3.18664e+08 )
							if( MFI <= 0.46626 )
								if( Negative_Money_Flow_Sum <= 9.1261e+08 )
									ret := -0.800000 // sell
								if( Negative_Money_Flow_Sum > 9.1261e+08 )
									ret := 0.161290
							if( MFI > 0.46626 )
								if( Raw_Money_Flow <= 3.09806e+08 )
									ret := -0.401961
								if( Raw_Money_Flow > 3.09806e+08 )
									ret := -1.000000 // sell
						if( Raw_Money_Flow > 3.18664e+08 )
							if( Negative_Money_Flow_Sum <= 1.26262e+09 )
								if( Raw_Money_Flow <= 3.27722e+08 )
									ret := 0.571429
								if( Raw_Money_Flow > 3.27722e+08 )
									ret := -0.437500
							if( Negative_Money_Flow_Sum > 1.26262e+09 )
								if( MFI_High <= -79.4572 )
									ret := 1.000000 // buy
								if( MFI_High > -79.4572 )
									ret := 0.375000
					if( Positive_Money_Flow_Sum > 1.45849e+07 )
						if( Positive_Money_Flow <= 2.77439e+08 )
							if( Positive_Money_Flow_Sum <= 1.75035e+07 )
								if( Typical_Price <= 105.373 )
									ret := -0.250000
								if( Typical_Price > 105.373 )
									ret := 0.600000
							if( Positive_Money_Flow_Sum > 1.75035e+07 )
								if( Raw_Money_Flow <= 2.79424e+08 )
									ret := 0.095087
								if( Raw_Money_Flow > 2.79424e+08 )
									ret := -0.001030
						if( Positive_Money_Flow > 2.77439e+08 )
							if( Positive_Money_Flow_Sum <= 4.60183e+08 )
								if( MFI <= 26.018 )
									ret := -0.024390
								if( MFI > 26.018 )
									ret := 0.608696
							if( Positive_Money_Flow_Sum > 4.60183e+08 )
								if( Positive_Money_Flow_Sum <= 1.34289e+09 )
									ret := -0.250804
								if( Positive_Money_Flow_Sum > 1.34289e+09 )
									ret := 0.121622
				if( Positive_Money_Flow_Sum > 1.58515e+09 )
					if( MFI <= 35.1008 )
						if( Money_Flow_Ratio <= 0.375552 )
							if( Money_Flow_Ratio <= 0.345434 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.345434 )
								ret := 0.500000
						if( Money_Flow_Ratio > 0.375552 )
							if( Positive_Money_Flow <= 3.22731e+08 )
								if( Typical_Price <= 118.048 )
									ret := 0.125000
								if( Typical_Price > 118.048 )
									ret := -0.836364 // sell
							if( Positive_Money_Flow > 3.22731e+08 )
								if( MFI_High <= -49.3321 )
									ret := -0.500000
								if( MFI_High > -49.3321 )
									ret := 0.375000
					if( MFI > 35.1008 )
						if( MFI_High <= -27.2479 )
							if( MFI <= 48.0103 )
								if( Money_Flow_Ratio <= 0.807872 )
									ret := 0.025641
								if( Money_Flow_Ratio > 0.807872 )
									ret := -0.422535
							if( MFI > 48.0103 )
								if( Negative_Money_Flow_Sum <= 2.3761e+09 )
									ret := 0.559633
								if( Negative_Money_Flow_Sum > 2.3761e+09 )
									ret := -0.629630
						if( MFI_High > -27.2479 )
							if( Typical_Price <= 86.5692 )
								if( Positive_Money_Flow_Sum <= 3.02452e+09 )
									ret := -0.250000
								if( Positive_Money_Flow_Sum > 3.02452e+09 )
									ret := 1.000000 // buy
							if( Typical_Price > 86.5692 )
								if( Typical_Price <= 301.146 )
									ret := -0.112388
								if( Typical_Price > 301.146 )
									ret := -0.750000 // sell
			if( Raw_Money_Flow > 4.31745e+08 )
				if( Negative_Money_Flow_Sum <= 4.15698e+09 )
					if( Positive_Money_Flow_Sum <= 1.38628e+08 )
						if( Negative_Money_Flow_Sum <= 1.33126e+09 )
							if( Typical_Price <= 211.662 )
								if( Negative_Money_Flow <= 9.03556e+08 )
									ret := 0.769841 // buy
								if( Negative_Money_Flow > 9.03556e+08 )
									ret := 0.364706
							if( Typical_Price > 211.662 )
								if( Raw_Money_Flow <= 1.04797e+09 )
									ret := 0.263889
								if( Raw_Money_Flow > 1.04797e+09 )
									ret := -0.545455
						if( Negative_Money_Flow_Sum > 1.33126e+09 )
							if( Negative_Money_Flow_Sum <= 1.60654e+09 )
								if( Positive_Money_Flow_Sum <= 6.46369e+07 )
									ret := -0.584906
								if( Positive_Money_Flow_Sum > 6.46369e+07 )
									ret := 0.454545
							if( Negative_Money_Flow_Sum > 1.60654e+09 )
								if( Typical_Price <= 141.582 )
									ret := 0.707317 // buy
								if( Typical_Price > 141.582 )
									ret := 0.035088
					if( Positive_Money_Flow_Sum > 1.38628e+08 )
						if( Positive_Money_Flow <= 6.4691e+08 )
							if( Negative_Money_Flow_Sum <= 9.66398e+08 )
								if( Typical_Price <= 151.471 )
									ret := 0.729730 // buy
								if( Typical_Price > 151.471 )
									ret := 0.072464
							if( Negative_Money_Flow_Sum > 9.66398e+08 )
								if( Money_Flow_Ratio <= 1.58003 )
									ret := 0.012712
								if( Money_Flow_Ratio > 1.58003 )
									ret := -0.230769
						if( Positive_Money_Flow > 6.4691e+08 )
							if( Positive_Money_Flow <= 1.08029e+09 )
								if( Typical_Price <= 98.584 )
									ret := 0.840000 // buy
								if( Typical_Price > 98.584 )
									ret := 0.333333
							if( Positive_Money_Flow > 1.08029e+09 )
								if( Money_Flow_Ratio <= 1.52371 )
									ret := 0.333333
								if( Money_Flow_Ratio > 1.52371 )
									ret := -0.259259
				if( Negative_Money_Flow_Sum > 4.15698e+09 )
					if( Typical_Price <= 290.338 )
						if( Negative_Money_Flow_Sum <= 4.56977e+09 )
							if( MFI <= 5.3282 )
								ret := -0.500000
							if( MFI > 5.3282 )
								if( MFI <= 28.4672 )
									ret := 0.944444 // buy
								if( MFI > 28.4672 )
									ret := 0.757576 // buy
						if( Negative_Money_Flow_Sum > 4.56977e+09 )
							if( MFI <= 26.6535 )
								if( Raw_Money_Flow <= 6.21071e+08 )
									ret := 0.341463
								if( Raw_Money_Flow > 6.21071e+08 )
									ret := 0.758621 // buy
							if( MFI > 26.6535 )
								if( Negative_Money_Flow_Sum <= 5.92431e+09 )
									ret := 0.435897
								if( Negative_Money_Flow_Sum > 5.92431e+09 )
									ret := -0.305556
					if( Typical_Price > 290.338 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_BABA_30Min_682ef475(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum)

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


